package com.nopcommerce.steps;

import com.nopcommerce.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class RegisterSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() { new RegisterPage().clickOnRegisterButton();
    }

    @And("^I enters following users details$")
    public void iEntersFollowingUsersDetails(DataTable dataTable) {
        new RegisterPage().getYourRegCompletedText();
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> e: userList ) {
            System.out.println(e);
            System.out.println(e.get(0));
        }
    }

    @And("^I click on REGISTRATION link$")
    public void iClickOnREGISTRATIONLink() {
    }

    @And("^I should see message\"<message>$")
    public void iShouldSeeMessageMessage() {
        String expectedMessage = "Your registration completed";
        String actualMessage = new RegisterPage().getYourRegCompletedText();
        Assert.assertEquals("message not displayed", expectedMessage, new RegisterPage().getYourRegCompletedText());
    }
}





