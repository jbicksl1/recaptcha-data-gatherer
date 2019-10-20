import org.sikuli.script.Screen;

public class RecaptchaPresenceDetector {
	private Screen screen;
	private Thread thread;
	private boolean isRunning;

	public RecaptchaPresenceDetector(Screen screen) {
		this.screen = screen;
		this.isRunning = false;
	}

	public void start() {
		this.isRunning = true;
		this.thread = new Thread(awaitRecaptcha);
		this.thread.start();
	}

	private Runnable awaitRecaptcha = () -> {
		System.out.println(RecaptchaPresenceDetector.this.screen);	
	};

	public void stop() {
		this.isRunning = false;
		this.thread.interrupt();
	}
}
