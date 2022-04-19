package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    //base Url
    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setupIt() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){

        //Find registration tab on the homepage and click it
        WebElement registrationlink = driver.findElement(By.linkText("Register"));
        registrationlink.click();

        //This is from requirement
        String expectedMessage = "Register";

        // find the Register text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualText = actualMessageElement.getText();

        //Verify the text ‘Register’
        Assert.assertEquals(expectedMessage,actualText);


    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){

        //Find registration tab on the homepage and click it
        WebElement registrationlink = driver.findElement(By.linkText("Register"));
        registrationlink.click();

        //Select gender radio button
        WebElement genderRadio = driver.findElement(By.id("gender-male"));
        genderRadio.click();

        //Enter First name
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Hardik");

        //Enter Last name
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Thaker");

        //Select Day Month and Year Syntax - Select select = new Select (WebElement)

//        Select birthDay = new Select(By.name("DateOfBirthDay"));
        Select selectBirthDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        selectBirthDay.selectByVisibleText("08");

        //select Month
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectMonth.selectByVisibleText("February");

        //select Year
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByVisibleText("1982");

        //Enter Email address
        WebElement emailAddress = driver.findElement(By.id("Email"));
        emailAddress.sendKeys("hvthaker1@gmail.com");

        //Enter Password
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Ahmedabad21");

        //Enter Confirm password
        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("Ahmedabad21");

        //Click on REGISTER button
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();

        //Verify the text 'Your registration completed
        String expectedMessage = "Your registration completed";
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

        //click continue button
        WebElement continueBtn = driver.findElement(By.xpath("/a[contains(text(),'Continue')]"));
        continueBtn.click();

    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
