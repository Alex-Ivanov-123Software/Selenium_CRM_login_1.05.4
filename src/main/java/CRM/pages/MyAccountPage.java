package CRM.pages;

import app_and_tech_drivers.DriverFactory;
import pages_factory.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

/**
 * Created by ${Alex} on 06.04.2016.
 */
public class MyAccountPage extends DriverFactory implements Page {

    // URL страницы ====================================================================================================

    private static String URL = "http://crmtest123.northeurope.cloudapp.azure.com/MyAccountApp/#myaccount";

    public static String getURL() {  return URL;
    }

    // Элементы страницы ===============================================================================================
    @FindBy(how= How.XPATH, using="//a[@name=\"deposit\"]")
    private WebElement depositLink;


    @FindBy(how=How.XPATH, using="//a[@name=\"withdrawal\"]")
    private WebElement withdrawalLink;


    @FindBy(how=How.XPATH, using="//a[@name=\"personal\"]")
    private WebElement personalDataLink;


    @FindBy(how=How.XPATH, using="//a[@name=\"security\"]")
    private WebElement securityLink;


    @FindBy(how=How.XPATH, using="//a[@name=\"documents\"]")
    private WebElement documentDownloadLink;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/ul[1]/li[1]/a[1]")
    private WebElement metaTraderDownload_Wondows;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/ul[1]/li[1]/a[1]")
    private WebElement metaTraderDownload_Wondows_Link;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/ul[1]/li[2]/a[1]")
    private WebElement metaTraderDownload_OSX_Link;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/ul[1]/li[3]/a[1]")
    private WebElement metaTraderDownload_Android_Link;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/ul[1]/li[4]/a[1]")
    private WebElement metaTraderDownload_IPhone_Link;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
    private WebElement metaTrader_Download_common;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/p[1]")
    private WebElement instructions;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
    private WebElement userID;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
    private WebElement currBalance;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
    private WebElement lastProfileUpdates;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/button[1]")
    private WebElement depositButton;


    @FindBy(how=How.XPATH, using="id(\"tab-myaccount\")/div[1]/div[1]/form[1]/div[1]")
    private WebElement mainProfileTable;


    public WebElement getSignOut_Link() {
        return signOut_Link;
    }

    @FindBy(how=How.XPATH, using="id(\"btnSignout\")")
    private WebElement signOut_Link;

    // Конструктор ====================================================================================================

    /*
    конструктор логин страницы
     */
    public MyAccountPage(){
        PageFactory.initElements(new HtmlElementDecorator(getDriver()), this);
    }
    // Методы страницы =================================================================================================

    public void log_out()
    {
        signOut_Link.click();
    }
}