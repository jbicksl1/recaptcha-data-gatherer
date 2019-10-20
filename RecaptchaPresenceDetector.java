import org.sikuli.script.FindFailed;
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
		while(isRunning) {
			try {
				screen.wait("sample-recaptcha.png", 1);
				System.out.println("sample recaptcha detected!");
			} catch(FindFailed findFailed) {
			}
			if(!isRunning) {
				break;
			}
		}
	};

	public void stop() {
		this.isRunning = false;
	}
}
