import java.util.Scanner;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

public class RecaptchaDataGatherer {
	public static void main(String[] args) throws InterruptedException {
		Screen screen = new Screen();
		ImagePath.add("./img");

		RecaptchaPresenceDetector recaptchaPresenceDetector = new RecaptchaPresenceDetector(screen);
		recaptchaPresenceDetector.start();

		System.out.println("Press ENTER to terminate.");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		scanner.close();

		recaptchaPresenceDetector.stop();
	}
}
