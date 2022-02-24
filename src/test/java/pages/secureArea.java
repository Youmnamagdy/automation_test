package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class secureArea {
    private  WebDriver driver;
    private By StatusAlert= By.id("flash");
    public secureArea(WebDriver driver){
        this.driver=driver;
    }
    public String getAlertText(){
       return  driver.findElement(StatusAlert).getText();
    }
    @Test
    public void teste4(){

    }
}

