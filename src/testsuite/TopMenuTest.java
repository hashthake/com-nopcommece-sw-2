package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    //base Url
    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //‘Computers’ Tab

        //Find Computers tab link and click it
        WebElement computersTab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        computersTab.click();

        //This is requirement
        String expectedText = "Computers";

        //finding actual text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualText = actualTextElement.getText();

        //Verify the text ‘Computers’
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully (){
        //‘Electronics’ Tab

        //Find Electronics tab link and click it
        WebElement electronicsTab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        electronicsTab.click();

        //this is requirement
        String expectedText = "Electronics";

        //finding actual text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualText = actualTextElement.getText();

        //Verify the text ‘Electronics’
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully (){
        //‘Apparel’ Tab

        //Find Apparel tab link and click it
        WebElement apparelTab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        apparelTab.click();

        //this is requirement
        String expectedText = "Apparel";

        //finding actual text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualText = actualTextElement.getText();

        //Verify the text ‘Apparel’
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully (){
        //‘Digital downloads’ Tab

        //Find Digital downloads tab link and click it
        WebElement digitalDownloadsTab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        digitalDownloadsTab.click();

        //this is requirement
        String expectedText = "Digital downloads";

        //finding actual text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualText = actualTextElement.getText();

        //Verify the text ‘Digital downloads’
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully (){
        //‘Books’ Tab

        //Find Books tab link and click it
        WebElement booksTab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        booksTab.click();

        //this is requirement
        String expectedText = "Books";

        //finding actual text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualText = actualTextElement.getText();

        // Verify the text ‘Books’
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //‘Jewelry’ Tab

        //Find Jewelry tab link and click it
        WebElement jewelryTab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        jewelryTab.click();

        //this is requirement
        String expectedText = "Jewelry";

        //finding actual text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualText = actualTextElement.getText();

        // Verify the text ‘Jewelry’
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully (){
        //‘Gift Cards’ Tab

        //Find Gift Cards tab link and click it
        WebElement giftCardsTab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        giftCardsTab.click();

        //this is requirement
        String expectedText = "Gift Cards";

        //finding actual text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualText = actualTextElement.getText();

        // Verify the text ‘Gift Cards’
        Assert.assertEquals(expectedText, actualText);

    }





    @After
    public void tearDown() {
        closeBrowser();
    }
}
