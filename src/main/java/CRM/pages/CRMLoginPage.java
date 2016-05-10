package CRM.pages;

import app_and_tech_drivers.DriverFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages_factory.Page;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

/**
 * Created by ${Alex} on 31.03.2016.
 */
public class CRMLoginPage extends DriverFactory implements Page {

    // URL страницы ====================================================================================================

    public static String getURL() {
        return URL;
    }

    private static String URL = "http://crmtest123.northeurope.cloudapp.azure.com/MyAccountApp/#login";

    // Элементы страницы ===============================================================================================

    @FindBy(how= How.XPATH, using="id(\"app-container\")/div[1]/form[1]/div[1]/div[1]/h4[1]")
    private TextBlock Header;

    @FindBy(how=How.XPATH, using="id(\"email\")")
    private TextInput email;

    @FindBy(how=How.XPATH, using="id(\"password\")")
    private TextInput password;

    @FindBy(how=How.XPATH, using="id(\"app-container\")/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]")
    private Button loginButton;

    @FindBy(how=How.XPATH, using="id(\"app-container\")/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]")
    private Link forgotYourPassLink;

    @FindBy(how=How.XPATH, using="id(\"app-container\")/div[1]/form[1]/div[1]/div[1]/p[1]/a[1]")
    private Link supportPageLink;

    @FindBy(how=How.XPATH, using="id(\"register-link\")")
    private Link registerAccountLink;

    @FindBy(how=How.XPATH, using="id(\"app-container\")/div[1]/div[1]/div[1]/span[2]")
    private TextBlock incorrectLoginPasswordMessage;

    // Конструктор ====================================================================================================

    public CRMLoginPage()/* throws InterruptedException*/ {
        PageFactory.initElements(new HtmlElementDecorator(getDriver()), this);
        getDriver().get("http://crmtest123.northeurope.cloudapp.azure.com/MyAccountApp/#login");
    }

    // Методы страницы =================================================================================================

    /*
    возвращет страницу регистрации нового аккаунта
     */
    public RegisterNewAccountPage registerNewAccount() throws InterruptedException {
        this.registerAccountLink.click();
        // переход на открытое окно:
        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }
        return new RegisterNewAccountPage();
    }

    /*
    возвращет страницу связи с поддержкой
     */
    public ContactSupportPage contactSuppor() throws InterruptedException {
        return new ContactSupportPage();
    }

    /*
    возвращет страницу восстановления пароля
     */
    public ForgotYouPassPage forgotYourPass() throws InterruptedException {
        this.forgotYourPassLink.click();
        return new ForgotYouPassPage();
    }

    /*
    выполняет логин на стартовой страничке
     */
    public MyAccountPage login(String email, String password) throws InterruptedException {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.loginButton.click();
        return new MyAccountPage();
    }
}
