package com.tallerconpatron.certificacion.colorlib.definition;

import com.tallerconpatron.certificacion.colorlib.step.TaskAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertTrue;

public class VerifyFormDefinition {
    private String user;
    private String password;
    private String required;
    private String select;
    private String mSelect;
    private String url;
    private String email;
    private String password2;
    private String confPassword2;
    private String minField;
    private String maxField;
    private String number;
    private String ip;
    private String date;
    private String dateEarlier;


    @Steps
    TaskAction taskAction;

    @Given("I enter with my credentials")
    public void iEnterWithMyCredentials(io.cucumber.datatable.DataTable dataTable) {
        this.user=dataTable.cell(1,0);
        this.password=dataTable.cell(1,1);
    }

    @When("I proceed with the authentication")
    public void iProceedWithTheAuthentication() {
        try {
            taskAction.openPage();
            taskAction.signIn(user,password);
        }catch (NullPointerException e){
            System.out.println("Null Pointer thrown");
        }
    }

    @And("go to the main view of the page")
    public void goToTheMainViewOfThePage() {
        assertTrue(taskAction.checkTitle());
    }

    @And("enter to the form submenu called form validations")
    public void enterToTheFormSubmenuCalledFormValidations() {
        taskAction.selectFormValidation();
    }

    @And("check the title of the form on the screen")
    public void checkTheTitleOfTheFormOnTheScreen() {
        assertTrue(taskAction.checkFormValidationTitle());
    }

    @And("fill all the file")
    public void fillAllTheFile(io.cucumber.datatable.DataTable dataTable) {
        this.required=dataTable.cell(1,2);
        this.select=dataTable.cell(1,3);
        this.mSelect=dataTable.cell(1,4);
        this.url=dataTable.cell(1,5);
        this.email=dataTable.cell(1,6);
        this.password2=dataTable.cell(1,7);
        this.confPassword2=dataTable.cell(1,8);
        this.minField=dataTable.cell(1,9);
        this.maxField=dataTable.cell(1,10);
        this.number=dataTable.cell(1,11);
        this.ip=dataTable.cell(1,12);
        this.date=dataTable.cell(1,13);
        this.dateEarlier=dataTable.cell(1,14);

        taskAction.fillFormValidation(required,select,mSelect,url,email,password2,confPassword2,minField,maxField,number,ip,date,dateEarlier);
    }

    @And("click the validate button")
    public void clickTheValidateButton() {
        taskAction.clickValidate();
    }

    @Then("the fields will go back to their initial state")
    public void theFieldsWillGoBackToTheirInitialState() {
        assertTrue(taskAction.verifyRequired());
        assertTrue(taskAction.verifySelect());
        assertTrue(taskAction.verifyMSelect());
        assertTrue(taskAction.verifyUrl());
        assertTrue(taskAction.verifyEmail());
        assertTrue(taskAction.verifyPassword2());
        assertTrue(taskAction.verifyCPassword2());
        assertTrue(taskAction.verifyMinSize());
        assertTrue(taskAction.verifyMaxSize());
        assertTrue(taskAction.verifyNumber());
        assertTrue(taskAction.verifyIP());
        assertTrue(taskAction.verifyDate());
        assertTrue(taskAction.verifyDateEarly());
    }
}
