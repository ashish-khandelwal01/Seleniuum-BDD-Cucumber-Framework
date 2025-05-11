package hooks;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.BaseClass;
import utilities.SeleniumTestBase;
import static utilities.SeleniumTestBase.driver;

/**
 * The Hooks class contains Cucumber hooks that are executed before and after specific steps or scenarios.
 * It provides functionality to set up the scenario context and capture screenshots on test failures.
 */
public class Hooks extends BaseClass {

    /**
     * Executes before each scenario to set the current scenario context.
     * @param scenario The current Cucumber scenario being executed.
     */
    @Before
    public void beforeHook(Scenario scenario) {
        BaseClass.scenario = scenario;
    }

    /**
     * Captures a screenshot after each step if the scenario has failed.
     * Ensures the WebDriver instance is valid before attempting to capture the screenshot.
     * @param scenario The current Cucumber scenario being executed.
     */
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed() && !driver.toString().contains("null")) {
            try {
                SeleniumTestBase sel = new SeleniumTestBase();
                sel.captureScreenshot(scenario);
            } catch (Exception e) {
                failLog("Unable to capture screenshot: " + e.getMessage());
            }
        }
    }
}