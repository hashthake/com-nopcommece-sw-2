package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Click on login button should move to login page
        WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        login.click();
        //check expected message display on login page
        String expectedMessage = "Welcome, Please Sign In!";
        //Check webeliment of actual message
        WebElement actualmessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualmessageElement.getText();
        //Validate actual and expected message
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @Test
    public void userShouldLoginWithValidCredentials(){
        //Click on login button should move to login page
        WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        login.click();
        //find element for mail field and send data
        WebElement userName = driver.findElement(By.id("Email"));
        userName.sendKeys("hvthaker@gmail.com");
        //find element for password field and send data
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("Ahmedabad20");
        //click on LOGIN button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        //find expected text logout
        String expectedMessage = "Log out";

        WebElement actualMesssageElement = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        String actualMessage = actualMesssageElement.getText();
        //Validate text
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @Test
            public void verifyTheErrorMessage(){
    //Click on login button should move to login page
    WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        login.click();
    //find element for mail field and send data
    WebElement userName = driver.findElement(By.id("Email"));
        userName.sendKeys("hvthake@gmail.com");
    //find element for password field and send data
    WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("Ahmedabad");
    //click on LOGIN button
    WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        //find expected text logout
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
        + "No customer account found";

        WebElement actualMessageElement = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]\n"));
        String actualMessage = actualMessageElement.getText();
        //Validate message
        Assert.assertEquals(expectedMessage,actualMessage);
    }

        @After
    public void tearDown(){
        closeBrowser();
    }
}
