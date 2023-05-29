package techproed.techproed.day01_ilkTest_Driver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        System.out.println(System.getProperty("chromeDriver"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println("Amazon Actual Title  : "+ driver.getTitle());// getTitle() methodu sayfa başlığını verir.
        System.out.println("Amazon Actual Url = " + driver.getCurrentUrl());
        String amazonWindowHanle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "+amazonWindowHanle);

        driver.get("https://techproeducation.com");
        System.out.println("Techproed Actual Title  : "+ driver.getTitle());// getTitle() methodu sayfa başlığını verir.

        //getCurrentUrl() Gidilen sayfanın Url'ini verir.
        System.out.println("Techproed Actual Url = " + driver.getCurrentUrl());

        //getPageSource() Açılan sayfanın kaynak kodlarını verir

        //System.out.println("Sayfa kaynak kodu = " + driver.getPageSource());  bilerek yoruma aldık her çalıştığında konsola bütün kaynak kodlarını vereceği için

        //getWindowHandle() Gidilen sayfanın handle değerini (hashcode) verir. Bu handle değerini sayfalar arası geçiş için kullanırız.
        System.out.println("Techproed Window Handle Değeri = " + driver.getWindowHandle());

    }
}
