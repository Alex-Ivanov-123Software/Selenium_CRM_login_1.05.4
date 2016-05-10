package steps;

import CRM.pages.CRMLoginPage;
import cucumber.api.java.en.When;

/**
 * Created by ${Alex} on 08.04.2016.
 * Класс организован для того, чтобы вызывать методы Given-этапа
 * Методы будут добавляться по мере добавлений features.
 * Результатом накопления может быть библиотека DSL проекта
 */
public class When_Steps
{
    /**
     * Метод выполняет бизнес-действие аутентификацию пользователя в CRM-системе Umarkets
     * @param email
     * @param password
     * @throws InterruptedException
     */
    @When("^user logins entering email as ([^\"]*) and password as ([^\"]*)$")
    public void user_logins_in_CRM_having_email_and_passsword(String email, String password) throws InterruptedException {
        new CRMLoginPage().login(email, password);
    }
}