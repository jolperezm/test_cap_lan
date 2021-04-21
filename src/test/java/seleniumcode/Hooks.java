package seleniumcode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Hooks {

    private static ChromeDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup(); //BoniGarcia --> ocupa mi version del chrome
        //WebDriverManager.firefoxdriver().setup();
        ChromeOptions options = new ChromeOptions();
        //FirefoxOptions options = new FirefoxOptions();

        options.addArguments("enable-automation");
        options.addArguments("--start-maximized", "--ignore-certificate-errors");
        options.addArguments("--no-sandbox");
        //options.addArguments("--headless","--window-size=2000,2080","--ignore-certificate-errors");
        ChromeOptions chromeOptions = options.setPageLoadStrategy(PageLoadStrategy.NONE);
        //FirefoxOptions firefoxOptions = options.setPageLoadStrategy(PageLoadStrategy.NONE);
        driver = new ChromeDriver(options);
        //driver = new FirefoxDriver(options);

    }


    @After
    public void tearDown(){
        driver.quit();
    }

    public static ChromeDriver getDriver() {
    //  public static FirefoxDriver getDriver() {
        return driver;
    }
}


