package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagesNewTours.PageNewToursLogin;

public class LoginNewToursStepDefs {
	PageNewToursLogin pageLogin = new PageNewToursLogin();
	
	@Given("abro la pagina de New Tours")
	public void abro_la_pagina_de_New_Tours() {
		System.out.println("Aqui lanzo el navegador y la pagina");
	    pageLogin.pagina();
	}

	@When("ingreso de {string} y {string}")
	public void ingreso_de_y(String string, String string2) {
	    pageLogin.enterUserName(string);
	    pageLogin.enterPassword(string2);
	   
	}

	@Then("ingresar al sistema")
	public void ingresar_al_sistema() {
		 pageLogin.clickSignIn();
	}
}
