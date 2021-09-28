package com.choucair.formacion.definition;

import com.choucair.formacion.steps.PopupValidationSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupvalidationDefinition {
	
	@Steps
	PopupValidationSteps PopupValidationSteps;

	@Given("^Auntentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void auntentico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave) {
	PopupValidationSteps.login_colorlib(Usuario, Clave);    
	}

	@Given("^ingreso a la funcionalidad forms validation$")
	public void ingreso_a_la_funcionalidad_forms_validation() {
	    
	}

	@When("^diligencio formulario popup validation$")
	public void diligencio_formulario_popup_validation(){
	    
	}

	@Then("^verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() throws Throwable {
	   
	}

}
