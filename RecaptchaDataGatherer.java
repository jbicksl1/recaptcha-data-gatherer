import org.sikuli.script.Screen;

public class RecaptchaDataGatherer {
	public static void main(String[] args) {
		Screen screen = new Screen();
		RecaptchaPresenceDetector recaptchaPresenceDetector = new RecaptchaPresenceDetector(screen);
		recaptchaPresenceDetector.start();
		recaptchaPresenceDetector.stop();
	}
}
