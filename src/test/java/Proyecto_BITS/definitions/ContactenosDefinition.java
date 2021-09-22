package Proyecto_BITS.definitions;

import Proyecto_BITS.steps.ContactenosSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContactenosDefinition {
	
	@Steps
	ContactenosSteps ContactenosSteps;
	
	@Given("^El usuario se encuentra en el home de Bits$")
	public void el_usuario_se_encuentra_en_el_home_de_Bits() throws Throwable {
		ContactenosSteps.abrirHome();
	}


	@When("^Hace click en el botón contactenos$")
	public void hace_click_en_el_botón_contactenos() throws Throwable {
		ContactenosSteps.clickContactenos();
	}

	@When("^Ingresa la informacion obligatoria del formulario start a project$")
	public void ingresa_la_informacion_obligatoria_del_formulario_start_a_project() throws Throwable {
		ContactenosSteps.ingresaInformación();
	}

	@When("^Hace clic en Enviar$")
	public void hace_clic_en_Enviar() throws Throwable {
		ContactenosSteps.clickEnviar();
	}

	@Then("^Confirma envio$")
	public void confirma_envio() throws Throwable {
		ContactenosSteps.confirmaEnvío();
	}

}
