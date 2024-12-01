package Base;


//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Baseclass {
    protected WebDriver driver;
    @Parameters({"browser"})
    @BeforeTest
    public void setup(String browsermname) {

       switch(browsermname){
           case "chrome":
               driver = new ChromeDriver();
               break;
           case "firefox":
               driver = new FirefoxDriver();
               break;
           case "edge":
               driver = new EdgeDriver();
               break;
           default:
               System.out.println("please pass the correct browser name");
               break;

       }
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
