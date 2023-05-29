package techproed.techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın Konumu = " + driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutu = " + driver.manage().window().getSize());

        //Browser'ı maximize yapalım.
        driver.manage().window().maximize();

        /*

            Bir web sitesine gittiğimizde browser default bir boyutta gelir.Ve açılan browser'daki webElementlere browser
        maximize olmadığı için ulaşamayabiliriz.Dolayısıyla browser'ı açtıktan sonra maximize yaparsak driver bütün
        web elementleri görür ve rahatlıkla müdahale edebilir.Bu yüzden browser'ı açtıktan sonra ilk olarak
        driver.manage().manage().window().maximize; yapmamız bizim webelementlere ulaşmada işimizi kolaylaştırır.
        Böylelikle fail yapmamoş oluruz.

         */

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın Konumu = " + driver.manage().window().getPosition());
        //Browser'ın boyutlarını yazdıralım

        System.out.println("Sayfanın boyutu = " + driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı fullScreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50,50));
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(1200,1200));
        Thread.sleep(3000);
        driver.close();




















    }
}
