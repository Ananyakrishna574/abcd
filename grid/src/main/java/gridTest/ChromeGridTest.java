package gridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		//ChromeOptions op = new ChromeOptions();
		//op.merge(cap);
		String hubUrl= "http://192.168.0.26:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),cap);
		
		driver.get("http://www.freecrm.com");
		String title = driver.getTitle();
		System.out.println(title);
	

	}

}
