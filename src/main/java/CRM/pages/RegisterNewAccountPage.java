package CRM.pages;

import app_and_tech_drivers.DriverFactory;
import pages_factory.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

/**
 * Created by ${Alex} on 01.04.2016.
 */
public class RegisterNewAccountPage extends DriverFactory implements Page {

    private static String URL = "http://crmtest123.northeurope.cloudapp.azure.com/MyAccountApp/?lang=en#register";
    public String getURL() {
        return URL;
    }

    @FindBy(how= How.XPATH, using="id(\"email\")")
    private TextInput email;


    @FindBy(how=How.XPATH, using="id(\"password\")")
    private TextInput password;


    @FindBy(how=How.XPATH, using="id(\"confirm\")")
    private TextInput confirmPassword;
    public Button getSubmitButton() {
        return submitButton;
    }

    @FindBy(how=How.XPATH, using="id(\"app-container\")/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/button[1]")
    private Button submitButton;


    @FindBy(how=How.XPATH, using="id(\"app-container\")/div[1]/form[1]/div[1]/div[1]/p[1]/a[1]")
    private Link loginPageLink;


    @FindBy(how=How.XPATH, using="id(\"app-container\")/div[1]/form[1]/div[1]/div[1]/p[2]/a[1]")
    private Link supportPageLink;

    public RegisterNewAccountPage() {
        PageFactory.initElements(new HtmlElementDecorator(getDriver()), this);
        getDriver().get(this.URL);
    }
}
