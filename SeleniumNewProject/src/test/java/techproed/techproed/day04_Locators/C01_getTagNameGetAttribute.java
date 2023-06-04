package techproed.techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //https://www.amazon.com/ sayfasına gidiniz.
        driver.get("https://www.amazon.com/");

        //arama kutusunu locate ediniz.
       WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //arama kutusunun tagName'inin "input" olduğunu test edin.
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";
        if (actualTagName.equals(expectedTagName)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED :" + actualTagName );

        //arama kutusunun name attribute'nun değerinin "field-keywords" olduğunu test ediniz.
        String actualAttribute = aramaKutusu.getAttribute("name");
        String expectedAttribute ="field-keywords";
        if (actualAttribute.equals(expectedAttribute)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED :"+ actualAttribute);
        Thread.sleep(2000);
        //sayfayu kapatınız.

        driver.close();












    }
}
