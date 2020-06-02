package COM.TestProject;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {

    public WebDriver driver;

    @BeforeClass
    public void setup () {
        //Create a Chrome driver. All test classes use this.
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.silentOutput","true");
        ChromeOptions cap=new ChromeOptions();
        cap.addArguments();
        // Intialize Browser
        
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        //Maximize Window
        driver.manage().window().maximize();


    }

    @AfterClass
    public void teardown ()
    {
        driver.quit();
    }
}


