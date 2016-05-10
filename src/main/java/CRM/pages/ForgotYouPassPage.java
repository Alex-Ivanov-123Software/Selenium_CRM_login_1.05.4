package CRM.pages;

import app_and_tech_drivers.DriverFactory;
import pages_factory.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

/**
 * Created by ${Alex} on 01.04.2016.
 */
public class ForgotYouPassPage extends DriverFactory implements Page {

    // URL страницы ====================================================================================================

    private static String URL =  "http://crmtest123.northeurope.cloudapp.azure.com/MyAccountApp/#forgotPassword";

    public static String getURL() {
        return URL;
    }

    // Элементы страницы ===============================================================================================

    @FindBy(how= How.XPATH, using="id(\"app-container\")/div[1]/form[1]/div[1]/div[1]/h4[1]")
    private WebElement title;

    @FindBy(how=How.XPATH, using="id(\"email\")")
    private WebElement email;

    @FindBy(how=How.XPATH, using="id(\"app-container\")/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    private WebElement submitButton;

    @FindBy(how=How.XPATH, using="id(\"app-container\")/div[1]/form[1]/div[1]/div[1]/p[1]/a[1]")
    private WebElement backToLoginPageLink;
    public WebElement getBackToLoginPageLink() {
        return backToLoginPageLink;
    }
    // Конструктор ====================================================================================================

    /*
    конструктор страницы восстановления пароля
     */
    public ForgotYouPassPage()
    {
        PageFactory.initElements(new HtmlElementDecorator(getDriver()), this);
    }
}
