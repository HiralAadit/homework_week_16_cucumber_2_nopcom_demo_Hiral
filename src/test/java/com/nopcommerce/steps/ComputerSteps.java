package com.nopcommerce.steps;

import com.nopcommerce.pages.ComputerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class ComputerSteps {
    @When("^I click on every submenu tab$")
    public void iClickOnEverySubmenuTab() {
        new ComputerPage().clickOnSubMenu("Desktop");
    }

    @And("^I can see submenu on display list$")
    public void iCanSeeSubmenuOnDisplayList() {
        new ComputerPage().clickOnSubMenu("Desktop");
    }
}
