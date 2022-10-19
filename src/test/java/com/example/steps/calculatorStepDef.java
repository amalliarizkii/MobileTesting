package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;

public class calculatorStepDef extends BaseTest {

    @When("user input angka1 field {int}")
    public void userInputAngka1Field(int value) {
        calculatorPage.inputNumber1(value);
    }

    @And("user click dropdown button")
    public void userClickDropdownButton() {
        calculatorPage.clickDropDown();
    }

    @And("user click multiple button")
    public void userClickMultipleButton() {
        calculatorPage.clickMultipleButton();
    }

    @And("user input angka2 field {int}")
    public void userInputAngkaField(int value) {
        calculatorPage.inputNumber2(value);
    }

    @And("user click equal button")
    public void userClickEqualButton() {
        calculatorPage.clickEqualButton();
    }

    @Then("the total result should be {int}")
    public void theTotalResultShouldBe(int resultTotal) {
        String resultText = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : 100", resultText);
        boolean isDisplayed = calculatorPage.checkResult();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }
}
