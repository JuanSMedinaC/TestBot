package com.tallerconpatron.certificacion.colorlib.step;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaFormValidation;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaLogin;
import com.tallerconpatron.certificacion.colorlib.pageobject.PaginaPrincipal;
import net.thucydides.core.annotations.Step;

public class TaskAction extends BasePage {
    private PaginaLogin paginaLogin;
    private PaginaPrincipal paginaPrincipal;
    private PaginaFormValidation paginaFormValidation;

    @Step
    public void openPage(){
        openApp();
    }

    @Step
    public void signIn(String strUser, String strPassword){
        sendKeysUser(strUser);
        sendKeysPassword(strPassword);
        paginaLogin.btnSingIn.waitUntilClickable().click();
    }

    public void sendKeysUser(String strUser){
        paginaLogin.user.click();
        paginaLogin.user.clear();
        paginaLogin.user.sendKeys(strUser);
    }

    public void sendKeysPassword(String strPassword){
        paginaLogin.password.click();
        paginaLogin.password.clear();
        paginaLogin.password.sendKeys(strPassword);
    }
    @Step
    public boolean checkTitle (){
        boolean equalname= "Bootstrap-Admin-Template".equals(paginaPrincipal.title.getText());
        return equalname;
    }
    @Step
    public void selectFormValidation(){
        paginaPrincipal.forms.waitUntilClickable().click();
        paginaPrincipal.formsValidation.waitUntilClickable().click();
    }
    @Step
    public boolean checkFormValidationTitle(){
        boolean equalname="Popup Validation".equals(paginaFormValidation.title.getText());
        return equalname;
    }
    @Step
    public void fillFormValidation(String required,String select,String mSelect,String url,String email,String password,String confirmPassword ,String minField,String maxField,String number,String ip,String date,String dateEarlier){
        sendKeysRequired(required);
        sendKeysSelect(select);
        sendKeysMSelect(mSelect);
        sendKeysUrl(url);
        sendKeysEmail(email);
        sendKeysPassword2(password);
        sendKeysCPassword2(confirmPassword);
        sendKeysMinField(minField);
        sendKeysMaxField(maxField);
        sendKeysNumber(number);
        sendKeysIP(ip);
        sendKeysDate(date);
        sendKeysDateEarlier(dateEarlier);
    }

    public void sendKeysRequired(String required){
        paginaFormValidation.required.click();
        paginaFormValidation.required.clear();
        paginaFormValidation.required.sendKeys(required);
    }
    public void sendKeysSelect(String select){
        if(select.equals("option1")){
            paginaFormValidation.select.waitUntilClickable();
            paginaFormValidation.select.click();
            paginaFormValidation.option1.waitUntilClickable();
            paginaFormValidation.option1.click();
        } else if (select.equals("option2")) {
            paginaFormValidation.select.waitUntilClickable();
            paginaFormValidation.select.click();
            paginaFormValidation.option2.waitUntilClickable();
            paginaFormValidation.option2.click();
        } else if (select.equals("option3")) {
            paginaFormValidation.select.waitUntilClickable();
            paginaFormValidation.select.click();
            paginaFormValidation.option3.waitUntilClickable();
            paginaFormValidation.option3.click();
        }else{
            System.out.println("Option not found");
        }
    }
    public void sendKeysMSelect(String mSelect){
        if(mSelect.equals("option1")){
            paginaFormValidation.mOption1.waitUntilClickable();
            paginaFormValidation.mOption1.click();
        } else if (mSelect.equals("option2")) {
            paginaFormValidation.mOption2.waitUntilClickable();
            paginaFormValidation.mOption2.click();
        } else if (mSelect.equals("option3")) {
            paginaFormValidation.mOption3.waitUntilClickable();
            paginaFormValidation.mOption3.click();
        }else{
            System.out.println("Option not found");
        }
    }

    public void sendKeysUrl(String url){
        paginaFormValidation.url.click();
        paginaFormValidation.url.clear();
        paginaFormValidation.url.sendKeys(url);
    }
    public void sendKeysEmail(String email){
        paginaFormValidation.email.click();
        paginaFormValidation.email.clear();
        paginaFormValidation.email.sendKeys(email);
    }
    public void sendKeysPassword2(String password){
        paginaFormValidation.password.click();
        paginaFormValidation.password.clear();
        paginaFormValidation.password.sendKeys(password);
    }
    public void sendKeysCPassword2(String confirmPassword){
        paginaFormValidation.confpassword.click();
        paginaFormValidation.confpassword.clear();
        paginaFormValidation.confpassword.sendKeys(confirmPassword);
    }
    public void sendKeysMinField(String minField){
        paginaFormValidation.minsize.click();
        paginaFormValidation.minsize.clear();
        paginaFormValidation.minsize.sendKeys(minField);
    }
    public void sendKeysMaxField(String maxField){
        paginaFormValidation.maxsize.click();
        paginaFormValidation.maxsize.clear();
        try{
            paginaFormValidation.maxsize.sendKeys(maxField);
        }catch (IllegalArgumentException e){
            paginaFormValidation.maxsize.sendKeys("");
        }

    }
    public void sendKeysNumber(String number){
        paginaFormValidation.number.click();
        paginaFormValidation.number.clear();
        paginaFormValidation.number.sendKeys(number);
    }
    public void sendKeysIP(String ip){
        paginaFormValidation.ip.click();
        paginaFormValidation.ip.clear();
        paginaFormValidation.ip.sendKeys(ip);
    }
    public void sendKeysDate(String date){
        paginaFormValidation.date.click();
        paginaFormValidation.date.clear();
        paginaFormValidation.date.sendKeys(date);
    }
    public void sendKeysDateEarlier(String dateEarlier){
        paginaFormValidation.dateEarlier.click();
        paginaFormValidation.dateEarlier.clear();
        paginaFormValidation.dateEarlier.sendKeys(dateEarlier);
    }

    @Step
    public void clickValidate(){
        paginaFormValidation.validateBtn.waitUntilClickable().click();
    }

    public boolean verifyRequired(){
        return paginaFormValidation.required.getText().isEmpty();
    }

    public boolean verifySelect(){
        return paginaFormValidation.select.isSelected();
    }
    public boolean verifyMSelect(){
        return !paginaFormValidation.mOption1.isSelected()&&!paginaFormValidation.mOption2.isSelected()&&!paginaFormValidation.mOption3.isSelected();
    }
    public boolean verifyUrl(){
        return "http://".equals(paginaFormValidation.url.getAttribute("value"));
    }
    public boolean verifyEmail(){
        return paginaFormValidation.email.getText().isEmpty();
    }
    public boolean verifyPassword2(){
        return paginaFormValidation.password.getText().isEmpty();
    }
    public boolean verifyCPassword2(){
        return paginaFormValidation.confpassword.getText().isEmpty();
    }
    public boolean verifyMinSize(){
        return paginaFormValidation.minsize.getText().isEmpty();
    }
    public boolean verifyMaxSize(){
        return "0123456789".equals(paginaFormValidation.maxsize.getAttribute("value"));
    }
    public boolean verifyNumber(){
        return "-33.87a".equals(paginaFormValidation.number.getAttribute("value"));
    }
    public boolean verifyIP(){
        return "192.168.3.".equals(paginaFormValidation.ip.getAttribute("value"));
    }
    public boolean verifyDate(){
        return "201-12-01".equals(paginaFormValidation.date.getAttribute("value"));
    }
    public boolean verifyDateEarly(){
        return "2012/12/16".equals(paginaFormValidation.dateEarlier.getAttribute("value"));
    }


}
