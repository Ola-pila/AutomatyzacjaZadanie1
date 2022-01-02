import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PierwszyTest {
    public static WebDriver driver;

    @Test
    public void test () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("http://www.selenium-shop.pl/");

        driver.manage().window().maximize();

        driver.findElement(By.id("menu-item-137")).click();

        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getCurrentUrl(), "http://www.selenium-shop.pl/sklep/");

    }
    @Test
    public void test2 () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("http://www.selenium-shop.pl/");

        driver.manage().window().maximize();

        driver.findElement(By.id("menu-item-134")).click();

        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getCurrentUrl(), "http://www.selenium-shop.pl/o-nas/");

    }
    @Test
    public void test3 () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("http://www.selenium-shop.pl/");

        driver.manage().window().maximize();

        driver.findElement(By.id("menu-item-135")).click();

        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getCurrentUrl(), "http://www.selenium-shop.pl/koszyk/");
    }

}
