package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
    private WebDriver driver ;
    private  By usernamefield= By.id("username");
    private  By passwordfield=By.id("password");
    private By loginbutton =By.cssSelector("#login button");
    public login(WebDriver driver){
        this.driver=driver;
    }
    public  void setUser(String username){
        driver.findElement(usernamefield).sendKeys(username);
    }
    public  void setPassw(String password){
        driver.findElement(passwordfield).sendKeys(password);
    }
    public secureArea clickloginbutton(){
        driver.findElement(loginbutton).click();
        return new secureArea(driver);
    }
}
