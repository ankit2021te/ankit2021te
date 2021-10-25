package SeleniumDocker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DockerSetup {

    @BeforeTest
    public void startDocker() throws Exception{

        Runtime.getRuntime().exec("/home/ankit/IdeaProjects/SeleniumDocker/StartDockerGrid");
    }

    @AfterTest
    public void shutdownDocker() throws IOException {

        Runtime.getRuntime().exec("ShutdownDockerGrid.bat");

    }

}
