package steps;

import cucumber.api.java.en.Then;
import pages_factory.AnyPage_Factory;
import pages_factory.Page;

/**
 * Класс организован для того, чтобы вызывать методы Then-этапа
 * Методы будут добавляться по мере добавлений features.
 * Результатом накопления может быть библиотека DSL проекта
 * Created by ${Alex} on 11.04.2016.
 */
public class Then_Steps {

    /**
     * Метод аналогичен методу Given-этапа,
     * выполняет создание любой запрашиваемой страницы
     * @param page - аргумент метода - страница, возвращаемая пользователю при выполнении бизнес-действия
     * @return
     * @throws Throwable
     */
    @Then("^user should see ([^\"]*)$")
    public Page user_Should_See(String page) throws Throwable {
        return new AnyPage_Factory().getInstance(page);
    }
}