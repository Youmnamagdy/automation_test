package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private  WebDriver driver;
    private By formAuthonticationLink=By.linkText("Form Authentication");
    public Homepage(WebDriver driver){
        this.driver =driver;
    }
    public login clickFromAuthentication(){
driver.findElement(formAuthonticationLink).click();
   return new login(driver);

    }

}
