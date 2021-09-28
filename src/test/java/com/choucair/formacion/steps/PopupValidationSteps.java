package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.colorlibloginpage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {

	colorlibloginpage colorlibloginpage;
	
	@Step
	public void login_colorlib(String strusuario, String strpass) {
//		a. abrir navegador con la url de prueba 
		colorlibloginpage.open();
		//b. ingresar usuario
		//c. ingresar pass 
		//d. click en boton sign in
		colorlibloginpage.IngresarDatos(strusuario, strpass);
		//e. verificar la autenticacion(label en home)
		colorlibloginpage.verificarHome();
		
	}
	
	
	
}
