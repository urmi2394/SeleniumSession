package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edge {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","C:\\Users\\baps\\IdeaProjects\\Edge\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        Thread.sleep(3000);
        driver.quit();




    }
}
