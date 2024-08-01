package utility;

import org.openqa.selenium.WebDriver;
import pageobject.JqueryPage;
import pageobject.LearnMoreAlertPage;

public class PageObjectManager {

WebDriver driver ;



    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LearnMoreAlertPage getAlertPage(){

        LearnMoreAlertPage Alert = new LearnMoreAlertPage(driver);
        return Alert;

    }
    public JqueryPage JqueryPage(){
        JqueryPage jqueryPage = new JqueryPage(driver);
        return jqueryPage;
    }

}
