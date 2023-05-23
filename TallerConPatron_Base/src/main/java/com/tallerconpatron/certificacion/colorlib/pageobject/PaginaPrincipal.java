package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/index.html?")
public class PaginaPrincipal extends PageObject {
    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/a")
    public WebElementFacade forms;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
    public WebElementFacade formsValidation;
    @FindBy(xpath = "//*[@id=\"bootstrap-admin-template\"]")
    public WebElementFacade title;
}
