package techproed.techproed.day01_ilkTest_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        //Java uygulamarında system özelliklerini ayarlamak için setProperty methodu ile kullanırız.

        System.out.println(System.getProperty("webdriver.chrome.driver"));
        //getPropert ile "Key" değerini girerek "value" ya ulaşabilirim

        WebDriver driver = new ChromeDriver();
        //ChromeDriver türünde yeni bir obje oluşturduk.
        driver.get("https://techproeducation.com");// get() methodu ile String olarak girilen url'e gideriz.

    }
}
