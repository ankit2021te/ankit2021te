package SeleniumDocker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerSelenium {

    @Test
    public void getTitle01() throws MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        URL url = new URL("http://localhost:4444/wd/hub/");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);
        driver.get("https://www.imdb.com/title/tt2700370/");
        System.out.println("Title 01::"+driver.getTitle());
    }
}
