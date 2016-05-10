package CRM.pages;

import app_and_tech_drivers.DriverFactory;
import pages_factory.Page;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;

/**
 * Created by ${Alex} on 01.04.2016.
 */
public class ContactSupportPage extends DriverFactory implements Page {

    public ContactSupportPage() {
        PageFactory.initElements(new HtmlElementDecorator(getDriver()), this);
    }
}
