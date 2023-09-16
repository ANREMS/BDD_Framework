package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class browser
{
    public static WebDriver driver;
    public static Actions act;
    public static WebDriverWait wait;

    public static WebDriver setDriver() throws Exception
    {
        String browserChoice = browser.fileProperties("browser");//chrome

        if (browserChoice.equals("chrome")) {
            driver = setChromeDriver();
        } else if (browserChoice.equals("firefox")) {
            driver = setFirefoxDriver();
        } else if (browserChoice == "Edge") {
            driver = setEdgeDriver();
        } else {
            System.out.println("Invalid data...");
        }
        return driver;
    }

    public static WebDriver setEdgeDriver()
    {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        return driver;
    }

    public static WebDriver setFirefoxDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver setChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
    public static String fileProperties(String propertiesData) throws Exception
    {
        String returnData = null;
        String filelocation = System.getProperty("user.dir") + "/src/main/resources/configure.properties";
        File file = new File(filelocation);
        FileInputStream fileinput = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fileinput);
        returnData = prop.getProperty(propertiesData);
        return returnData;
    }
    public static void geturl() throws Exception
    {
        String url = browser.fileProperties("url");
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(2000);
       // wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      //  wait.until(ExpectedConditions.titleIs("Smartbazaar-World of Asian Foods"));

    }

    public static void closebrowser()
    {
        driver.quit();
    }
}
