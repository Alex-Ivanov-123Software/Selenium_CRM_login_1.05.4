package pages_factory;

import CRM.pages.*;

/**
 * Фабрика для создания страниц WEB-приложения, требуемых пользователем либо тестируемым сценарием
 * Created by ${Alex} on 08.04.2016.
 */
public class AnyPage_Factory {

    Page page = null;

    public Page getInstance(String page_name) throws InterruptedException {
        switch (page_name) {
            case "CRMLoginPage":
                page = new CRMLoginPage();
                break;
            case "ContactSupportPage":
                page = new ContactSupportPage();
                break;
            case "ForgotYouPassPage":
                page = new ForgotYouPassPage();
                break;
            case "MyAccountPage":
                page = new MyAccountPage();
                break;
            case "RegisterNewAccountPage":
                page = new RegisterNewAccountPage();
                break;
            default:
                break;
        }
        return page;
    }
}
