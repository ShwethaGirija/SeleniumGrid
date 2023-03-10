import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.MAC);
		
		ChromeOptions opt = new ChromeOptions();
		opt.merge(cap);
		
		String huburl = "http://192.168.202.221:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(huburl), opt);
		
		driver.get("http://www.google.com");
		System.out.println("Title is "+driver.getTitle());
		
		
	}

}
