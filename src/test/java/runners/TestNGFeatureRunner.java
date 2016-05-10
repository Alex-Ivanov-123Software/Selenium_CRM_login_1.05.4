package runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by ${Alex} on 07.04.2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        /**
         * путь в features-файлам
        */
        features = {
                "src/test/resources/features"
        },
        /**
         * необходимо для многопоточного запуска
        */
        monochrome = false,
        /**
         * путь к классам StepsDefinition
        */
        glue = {
                "steps"
        },
        /**
         * Формат отчета, помещается в target-ветке
        */
        plugin = {
//                /**
//                 * вывод в консоль
//                 */
//                "pretty",
//                /**
//                 * формирование HTML страницы с отчетом
//                 */
//               "html:target/reports/cucumber/html",
//                /**
//                 * json-cucumber
//                 */
//                "json:target/cucumber.json",
//                /**
//                 * json-usage
//                 */
//                "usage:target/usage.jsonx",
//                /**
//                 * jnuit
//                 */
                "junit:target/junit.xml",
        },
        /**
         * Можно задавать выполнение тестов только по аннотированным (@-тегом) классам
        */
        tags = {}
)
public class TestNGFeatureRunner extends AbstractTestNGCucumberTests
{}
