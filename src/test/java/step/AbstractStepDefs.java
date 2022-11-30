package step;

import inf.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * 初始化，包括启动驱动和使用implicitlyWait的Selenium隐式等待
 */
public abstract class AbstractStepDefs {

    private static final int WAIT_TIME = 10;

    static WebDriver driver;

    protected static HomePage homePage;

    static {
        /*
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);
        //options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
         */
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);
        //设置Selenium隐式等待
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        //设置浏览器页面为全屏
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

}
