package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class colorlibloginpage extends PageObject{
	//Campo usuario
	@FindBy(xpath="//*[@id='login']/form/input[1]")
	public WebElementFacade txtUsername;
	
	//Campo Password
	@FindBy(xpath="//*[@id='login']/form/input[2]")
	public WebElementFacade txtPassword;
	
	//Campo BtnSign
	@FindBy(xpath="//button[@class='btn btn-lg btn-primary btn-block']")
	public WebElementFacade btnSignin;
	
	//Lbl home verifiar
	@FindBy(id="bootstrap-admin-template")
	public WebElementFacade lblHomePpal;


 public void IngresarDatos(String strusuario, String strpass) {
	 txtUsername.sendKeys(strusuario);
	 txtPassword.sendKeys(strpass);
	 btnSignin.click();
 }
 
 public void verificarHome() {
	 String labelv = "Bootstrap-Admin-Template";
	 String strmensaje = lblHomePpal.getText();
	 assertThat(strmensaje, containsString(labelv));
 }
}
