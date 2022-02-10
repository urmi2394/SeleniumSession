package seleniumsession;

import org.openqa.selenium.WebDriver;


public class EdgeDriver {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","C:\\Users\\baps\\IdeaProjects\\Edge\\msedgedriver.exe");

        WebDriver driver = new org.openqa.selenium.edge.EdgeDriver();
        Thread.sleep(3000);
        driver.quit();




    }
}
