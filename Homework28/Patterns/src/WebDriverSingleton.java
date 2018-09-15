import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

	private static WebDriver instance;

	private WebDriverSingleton() {
	}

	public static WebDriver getInstance() {
		if (instance == null) {
			instance = new ChromeDriver();
		}
		return instance;

	}

}
