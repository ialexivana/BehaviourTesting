package com.bda.app.definitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.bda.app.definitions.steps.FMISteps;

import net.thucydides.core.annotations.Steps;

public class FMIDefinitions {
	
	@Steps
    FMISteps user;

    /** Given the user is on the FMI language page.
	 */
    @Given("the user is on the FMI language page")
    public void givenTheUserIsOnFMILanguagePage() {
        user.isOnHomepage();
    }

    /** When the user clicks on romanian language.
	 */
    @When("the user clicks on romanian language")
    public void whenTheUserClicksOnRomanianLanguage() {
        user.performsClickOnRo();
    }

    /** Then the user should see the title.
	 * @param title
	 */
    @Then("the user should see the title: '$title'")
    public void thenTheUserShouldSeeTheTitle(String title) {
        user.pageTitleIsMatching(title);
    }

    /** Then the user should click on the left menu row where name.
     * @param name
     */
    @Then("the user should click the left menu row where name: '$name'")
    public void thenTheUserShouldClickMenuRowWhereName(String name) {
        user.clickLeftMenuRowWhereName(name);
    }
}
