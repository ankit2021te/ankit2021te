package SeleniumDocker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SeleniumStandaloneTest {

    public static void main(String[] args) throws Exception{

        DesiredCapabilities dc = DesiredCapabilities.chrome();
        URL url = new URL("http://localhost:4444/wd/hub/");

        RemoteWebDriver driver = new RemoteWebDriver(url,dc);

    }
}
