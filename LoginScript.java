package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\IdeaProjects\\Software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("Email")).sendKeys("urmi2394@gmail.com");
        Thread.sleep(3000);

        driver.findElement(By.id("Password")).sendKeys("urmi2301");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        Thread.sleep(3000);
        driver.close();

    }
    }

