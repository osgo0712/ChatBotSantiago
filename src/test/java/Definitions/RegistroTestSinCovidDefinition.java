package Definitions;

import Steps.RegistroTestSinCovidStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistroTestSinCovidDefinition {

	@Steps
	RegistroTestSinCovidStep RegistroTestSinCovidStep;
	
	@Given("^El usuario se encuentra en la App web de telegram$")
	public void el_usuario_se_encuentra_en_la_App_web_de_telegram() throws Throwable {

		RegistroTestSinCovidStep.abrirHome();
	}

	@When("^Realiza inicio de sesion por QR$")
	public void realiza_inicio_de_sesion_por_QR() throws Throwable {

		RegistroTestSinCovidStep.InicioSesion();
	}

	@When("^Consultar en opcion @ColsubsidioBot e inicia conversacion desde cero con mensaje hola$")
	public void consultar_en_opcion_ColsubsidioBot_e_inicia_conversacion_desde_cero_con_mensaje_hola() throws Throwable {

		RegistroTestSinCovidStep.InicioConversacion();
	}

	@When("^Ingresa cuarta opcion (\\d+)\\.Test de riesgo CORONAVIRUS COVID(\\d+)$")
	public void ingresa_cuarta_opcion_Test_de_riesgo_CORONAVIRUS_COVID(int arg1, int arg2) throws Throwable {

		RegistroTestSinCovidStep.TestCovid();
	}

	@When("^Ingresa primera opcion (\\d+)\\.CC$")
	public void ingresa_primera_opcion_CC(int arg1) throws Throwable {

		RegistroTestSinCovidStep.SeleccionCedula();
	}

	@When("^Ingresa numero de documento cedula de ciudadania$")
	public void ingresa_numero_de_documento_cedula_de_ciudadania() throws Throwable {

		RegistroTestSinCovidStep.IngresoNumeroDocumento();
	}

	@When("^Ingresa primera opcion continuar$")
	public void ingresa_primera_opcion_continuar() throws Throwable {

		RegistroTestSinCovidStep.ContinuarTest();
	}

	@When("^ingresa segunda opcion No presenta sintomas$")
	public void ingresa_segunda_opcion_No_presenta_sintomas() throws Throwable {

		RegistroTestSinCovidStep.NoPresentaSintomas();
	}

	@When("^ingresa segunda opcion No presenta sintomas de tos$")
	public void ingresa_segunda_opcion_No_presenta_sintomas_de_tos() throws Throwable {

		RegistroTestSinCovidStep.NoPresentaSintomasTos();
	}

	@When("^ingresa segunda opcion No historial de enfermedades$")
	public void ingresa_segunda_opcion_No_historial_de_enfermedades() throws Throwable {

		RegistroTestSinCovidStep.SinHistorialEnfermedades();
	}

	@When("^ingresa segunda opcion No contacto con personas congiadas$")
	public void ingresa_segunda_opcion_No_contacto_con_personas_congiadas() throws Throwable {

		RegistroTestSinCovidStep.SinContactoPersonasContagiadas();
	}

	@Then("^Ingresa segunda opc salir$")
	public void ingresa_segunda_opc_salir() throws Throwable {

		RegistroTestSinCovidStep.Salir();
	}
}
