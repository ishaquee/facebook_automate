import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class FacebookAutomate {
    public static void main(String[] args) throws InterruptedException
    {
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        System.setProperty("webdriver.chrome.driver","/Users/mohammedishaque/Desktop/projects/Selenium_projects/facebook_automate/Facebook_automate/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("amors1973@superrito.com");
        driver.findElement(By.id("pass")).sendKeys("Ishaque@123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(7000);

        driver.findElement(By.xpath("//input[@placeholder=\"Search Facebook\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Search Facebook\"]")).sendKeys("HtML");
        driver.findElement(By.xpath("//input[@placeholder=\"Search Facebook\"]")).sendKeys(Keys.ENTER);

        Thread.sleep(8000);

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/a[1]/div[1]/div[2]")).click();

        Thread.sleep(3000);


        String araay =  driver.findElement(By.xpath("//div[@role=\"feed\"]")).getText();

        for(int i = 0; i <= araay.length(); i++)
        {
            System.out.println(" index is gping ip "+araay);
        }


    }
}