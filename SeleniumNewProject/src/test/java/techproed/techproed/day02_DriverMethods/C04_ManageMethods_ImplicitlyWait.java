package techproed.techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        implicitlyWait(Duration.ofSeconds(20))
             Sayfadaki webelementleri görünür olana kadar (sayfada oluşana kadar maksimum 20 saniye bekler.Eğer webelementler
        2 saniyede oluşursa 2 saniye bekler ve alt satıra geçer.Fakat belirttiğimiz max. süre boyunca internetten yada
        sayfadan kaynaklı olarak webelementler oluşmazsa testimiz fail verir.
        Thread.sleep() java kodlarını bizim belirttiğimiz süre kadar bekler.30 saniye beklemesini belirtirsek 30 saniye
        bekler ve alt satıra geçer.
         */

        //techproed sayfasına gidelim
        String techproUrl = "https://techproeducation.com";
        String amazonUrl = "https://amazon.com";

        driver.get(techproUrl);
        //amazona gidelim
        driver.get(amazonUrl);
        //techpro sayfasına dönelim
        driver.navigate().back();
        //sayfa başlığının Techpro içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String arananKelime ="Techpro";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED " + actualTitle);
        //tekrar amazon sayfasına gidelim
        driver.navigate().forward();
        //sayfa başlığının Amazon içerdiğini test edelim
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


        //Sayfayı kapatalım
        driver.close();



    }
}
