package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Homepage;


public class base_test {
    private WebDriver driver;
    protected Homepage homepage;
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homepage = new Homepage(driver);
//        driver.manage().window().setSize(new Dimension(375 ,812));
//
//     List<WebElement> Links =driver.findElements(By.tagName("a"));
//        System.out.println(Links.size());
//        WebElement InputsLink= driver.findElement(By.linkText("Angie"));
//         InputsLink.click();
    }
    @AfterClass
    public void teardown(){
       driver.quit();
    }
public static void main(String[] args){
        base_test test=new base_test();
        test.setup();
}
}
