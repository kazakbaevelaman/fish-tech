import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
    @Test
    public void Test3(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.close();
    }
}
