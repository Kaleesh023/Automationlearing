package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JqueryPage {

    WebDriver driver;

    public JqueryPage(WebDriver driver) {
        this.driver = driver;

    }

    public void DragandDrop(){
        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);
        WebElement drag =  driver.findElement(By.xpath("https://jqueryui.com/droppable/"));
      WebElement drop =   driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).build().perform();

    }
    public String ValidateDroppedText(){
      return driver.findElement(By.xpath("//p[text() = 'Dropped!']")).getText();


    }
}