package techproed.techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {
    public static void main(String[] args) throws InterruptedException {




        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz

        driver.get("https://amazon.com/");

        // aramakutusunu locate ediniz ve Nutella aratınız
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
       aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
       driver.navigate().back();

        WebElement buyutec = driver.findElement(By.id("nav-search-submit-button"));
        aramaKutusu.sendKeys("hot wheels");
        buyutec.click();
        Thread.sleep(3000);
        // sayfayı kapatınız
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hot Wheels" + Keys.ENTER); //üsttekiyle aynı işi yapar. exceptions almayı engeller ikili işlemde

        driver.close();


    }
}
