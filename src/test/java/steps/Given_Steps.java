package steps;

import cucumber.api.java.en.Given;
import pages_factory.AnyPage_Factory;
import pages_factory.Page;

/**
 * Created by ${Alex} on 07.04.2016.
 * Класс организован для того, чтобы вызывать методы Given-этапа
 * Методы будут добавляться по мере добавлений features.
 * Результатом накопления может быть библиотека DSL проекта
 */
public class Given_Steps {

    /**
     * Метод позволяет переходить на требуемую страницу.
     * Исходные данные страницы берутся при помощи регулярного выражения
     * @param page
     * @return объект типа Page, который создается при помощи фабрики AnyPage_Factory()
     * @throws Throwable
     */
    @Given("^the user is on ([^\"]*)$")
    public Page theUserIsOnPage(String page) throws Throwable {
        return new AnyPage_Factory().getInstance(page);
    }
}