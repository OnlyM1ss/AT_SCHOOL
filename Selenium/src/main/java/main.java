import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.security.cert.X509CRLSelector;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\D1sabler\\AT_SCHOOL\\Selenium\\src\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        webDriver.get("https://www.avito.ru");
        webDriver.findElement(By.id("search")).sendKeys("Принтер");
        WebElement ecategory = webDriver.findElement(By.id("category"));//категория товара
        Select category = new Select(ecategory);
        category.selectByValue("99");//значение
        WebElement mainLocation = webDriver.findElement(By.xpath("//div[@class='main-root-Xf3Eb']"));
        mainLocation.findElement(By.xpath("//div[@class='main-locationWrapper-3C0pT']")).click();
        WebElement inputCity = webDriver.findElement(By.xpath("//div[@class='popup-city-2f27s']"));
        inputCity.findElement(By.xpath("//input[@class='suggest-input-3p8yi']")).sendKeys("Владивосток");
        WebElement showPresent = webDriver.findElement(By.xpath("//div[@class='popup-buttons-NqjQ3']"));
        WebElement buttonPresent = webDriver.findElement(By.xpath("//div"));
        showPresent.findElement(By.xpath("//button[@class='button-button-2Fo5k button-size-m-7jtw4 button-primary-1RhOG']")).click();
        WebElement indexContent = webDriver.findElement(By.xpath("//div[@class='index-content-2lnSO']"));
        Select selectRich = new Select(indexContent.findElement(By.xpath("//div[@class='form-select-v2 sort-select-3QxXG']")).findElement(By.xpath("select")));
        selectRich.selectByValue("2");
        /*Первый принтер*/
        WebElement firstPrinter = webDriver.findElement(By.xpath("//div[@class='item_table-wrapper']"));
        WebElement nameFirstPrinter = firstPrinter.findElement(By.xpath("//h3[@class='snippet-title']")).findElement(By.xpath("//a[@class='snippet-link']"));
        System.out.println("Имя первого принтера: " + nameFirstPrinter.getText());
        WebElement priceFirstPrinter = firstPrinter.findElement(By.xpath("//div[@class='snippet-price-row']")).findElement(By.xpath("//span[@class='snippet-price ']"));
        System.out.println("Цена: " + priceFirstPrinter.getText());
        webDriver.quit();
    }
}
