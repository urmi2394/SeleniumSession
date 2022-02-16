package seleniumsession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);

        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("gender"));
        driver.findElement(By.id("gender-female")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("FirstName")).sendKeys("Urmi");
        Thread.sleep(2000);

        driver.findElement(By.id("LastName")).sendKeys("Patel");
        Thread.sleep(2000);


        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));


        Select select = new Select(day);
        select.selectByIndex(23);
        Thread.sleep(2000);

        Select select1 = new Select(month);
        select1.selectByVisibleText("January");
        Thread.sleep(2000);

        Select select2 = new Select(year);
        select2.selectByValue("1994");
        Thread.sleep(2000);

        driver.findElement(By.id("Email")).sendKeys("urmi2394@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("Company")).sendKeys("Unify");
        Thread.sleep(2000);

        driver.findElement(By.id("Newsletter")).isSelected();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("urmi2394");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("urmi2394");
        Thread.sleep(2000);

        driver.findElement(By.id("register-button")).click();
        Thread.sleep(2000);

        driver.close();
    }
}
