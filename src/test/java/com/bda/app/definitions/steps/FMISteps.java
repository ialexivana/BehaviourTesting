package com.bda.app.definitions.steps;

import static org.hamcrest.MatcherAssert.assertThat;

import com.bda.app.pages.HomePage;
import com.bda.app.pages.LanguagePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class FMISteps extends ScenarioSteps {
	
	LanguagePage languagePage;
	HomePage homePage;

    /** Performs search.
	 */
    @Step
    public void performsClickOnRo() {
        languagePage.clickBtnRo();
    }

    /** The page title is matching.
	 * @param title
	 */
    @Step
    public void pageTitleIsMatching(String title) {
        assertThat("The page title: " + languagePage.getTitle() + " is not matching: " + title,
                languagePage.getTitle().equals(title));
    }

    /** Checks if is on homepage.
	 */
    @Step
    public void isOnHomepage() {
        languagePage.open();
    }

    /** Click on the left menu row where name.
     * @param name
     */
    @Step
    public void clickLeftMenuRowWhereName(String name) {
        homePage.clickLeftMenuRowWhereName(name);
    }

}
