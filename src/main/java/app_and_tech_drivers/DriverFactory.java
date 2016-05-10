package app_and_tech_drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Класс создает WebDriver. Позволяет удалить созданный драйвер чтобы избежать ложного обращения
 * Created by ${Alex} on 14.04.2016.
 */
public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory() {
        initialize();
    }

    /**
     * метод "имитирует" логику синглтона
     */
    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }

    // сама фабрика драйверов
    private void createNewDriverInstance() {
        /**
         * PropertyReader - считывает параметры из рерурса
         * хранимого в config.properties подветки test
         */
        String browser = new PropertyReader().readProperty("browser");
        switch(browser) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("can't read browser type");
        }
        /**
         * используется implicitlyWait для сокращения времени простоя тестов
         */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Позволяет удалить созданный драйвер чтобы избежать ложного обращения из тестов
     */
    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}