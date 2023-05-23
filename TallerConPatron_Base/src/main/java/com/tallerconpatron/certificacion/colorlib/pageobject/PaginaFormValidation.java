package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/form-validation.html")
public class PaginaFormValidation extends PageObject {
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div/div/header/h5")
    public WebElementFacade title;
    @FindBy(xpath = "//*[@id=\"req\"]")
    public WebElementFacade required;
    @FindBy(xpath = "//*[@id=\"sport\"]/option[1]")
    public WebElementFacade select;
    @FindBy(xpath = "//*[@id=\"sport\"]/option[2]")//Tennis
    public WebElementFacade option1;
    @FindBy(xpath = "//*[@id=\"sport\"]/option[3]")//Football
    public WebElementFacade option2;
    @FindBy(xpath = "//*[@id=\"sport\"]/option[4]")//Golf
    public WebElementFacade option3;
    @FindBy(xpath = "//*[@id=\"sport2\"]/option[1]")//choose a sport
    public WebElementFacade choose;
    @FindBy(xpath = "//*[@id=\"sport2\"]/option[2]")//Tennis
    public WebElementFacade mOption1;
    @FindBy(xpath = "//*[@id=\"sport2\"]/option[3]")//Football
    public WebElementFacade mOption2;
    @FindBy(xpath = "//*[@id=\"sport2\"]/option[4]")//Golf
    public WebElementFacade mOption3;
    @FindBy(xpath = "//*[@id=\"url1\"]")
    public WebElementFacade url;
    @FindBy(xpath = "//*[@id=\"email1\"]")
    public WebElementFacade email;
    @FindBy(xpath = "//*[@id=\"pass1\"]")
    public WebElementFacade password;
    @FindBy(xpath = "//*[@id=\"pass2\"]")
    public WebElementFacade confpassword;
    @FindBy(xpath = "//*[@id=\"minsize1\"]")
    public WebElementFacade minsize;
    @FindBy(xpath = "//*[@id=\"maxsize1\"]")
    public WebElementFacade maxsize;
    @FindBy(xpath = "//*[@id=\"number2\"]")
    public WebElementFacade number;
    @FindBy(xpath = "//*[@id=\"ip\"]")
    public WebElementFacade ip;
    @FindBy(xpath = "//*[@id=\"date3\"]")
    public WebElementFacade date;
    @FindBy(xpath = "//*[@id=\"past\"]")
    public WebElementFacade dateEarlier;
    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[14]/input")
    public WebElementFacade validateBtn;
}
