package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarEnGoogleStepDefs {
	WebDriver driver;
	
	@Given("que lanzo el navegador chrome")
	public void que_lanzo_el_navegador_chrome() {
	    System.out.println("Aqui lanzo el navegador");
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
	}

	@When("abro la pagina de inicio de google")
	public void abro_la_pagina_de_inicio_de_google() {
	   System.out.println("Abro el sitio");
	   driver.get("https://www.google.com.co/");
	}

	@Then("Busco {string} en google")
	public void busco_en_google(String string) {
	    System.out.println("Buscar el string");
	    driver.findElement(By.className("gsfi")).sendKeys("Ralph");
	    driver.findElement(By.name("btnK")).click();
	}


}
