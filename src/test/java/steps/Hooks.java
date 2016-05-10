package steps;

import app_and_tech_drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

/**
 * Created by ${Alex} on 14.04.2016.
 * Cucumber hooks are executed before or after each scenario
 */
public class Hooks {

    private WebDriver driver;

    /**
     * this will run before the actual scenario
     */
    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
    }

    /**
     * this will run after scneario is finished, even if it failed
     */
    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
    }

    /**
     * This should run everytime before any @-TAG is going to run
     */
    @Before("@CRMLoginPage_2")
    public void signupSetup() {
        //  System.out.println("++++++++++++++++++++     Works Before scenario in @YOUR-FEATURE-TAG       +++++++++++++++++++++");
    }

    /**
     *  This should run everytime after any any @-TAG is going to run
     */
    @After("@CRMLoginPage_2")
    public void signupTeardown() {
        // System.out.println("!!!!!!!!!!!!!!!!!!!!!!   Works After scenario in @YOUR-FEATURE-TAG       !!!!!!!!!!!!!!!!!!!!!");
    }
}