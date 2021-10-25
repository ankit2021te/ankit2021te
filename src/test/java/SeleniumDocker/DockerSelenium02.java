package SeleniumDocker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerSelenium02 {

    @Test
    public void getTitle02() throws MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        URL url = new URL("http://localhost:4445/wd/hub/");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);
        driver.get("https://welcome.us/");
        System.out.println("Title 02::"+driver.getTitle());
    }
}
