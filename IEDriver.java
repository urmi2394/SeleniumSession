package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.ie.driver","C:\\Users\\baps\\IdeaProjects\\IE\\IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();
        Thread.sleep(3000);

        driver.quit();

    }
}
