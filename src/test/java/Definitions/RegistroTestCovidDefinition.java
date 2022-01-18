package Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.RegistroTestCovidStep;

public class RegistroTestCovidDefinition {
	
	@Steps
	RegistroTestCovidStep RegistroTestCovidStep;
	
	@Given("^El usuario se encuentra en la aplicacion web de telegram$")
	public void el_usuario_se_encuentra_en_la_aplicacion_web_de_telegram() throws Throwable {

		RegistroTestCovidStep.abrirHome();
	}

	@When("^Realiza inicio de sesion por codigo QR$")
	public void realiza_inicio_de_sesion_por_codigo_QR() throws Throwable {

		RegistroTestCovidStep.InicioSesion();
	}

	@When("^Hace click en consulta search y consulta @ColsubsidioBot e inicia conversacion desde cero con mensaje hola$")
	public void hace_click_en_consulta_search_y_consulta_ColsubsidioBot_e_inicia_conversacion_desde_cero_con_mensaje_hola() throws Throwable {
		
		RegistroTestCovidStep.InicioConversacion();
	}

	@When("^Ingresa cuarta opcion Test de riesgo CORONAVIRUS COVID(\\d+)$")
	public void ingresa_cuarta_opcion_Test_de_riesgo_CORONAVIRUS_COVID(int arg1) throws Throwable {
		
		RegistroTestCovidStep.TestCovid();
	}

	@When("^Ingresa primera opcion CC$")
	public void ingresa_primera_opcion_CC() throws Throwable {
		
		RegistroTestCovidStep.SeleccionCedula();
	}

	@When("^Ingresa documento numero de cedula de ciudadania$")
	public void ingresa_documento_numero_de_cedula_de_ciudadania() throws Throwable {

		RegistroTestCovidStep.IngresoNumeroDocumento();
	}

	@When("^Ingresa primera opcion continuar con el proceso$")
	public void ingresa_primera_opcion_continuar_con_el_proceso() throws Throwable {
		
		RegistroTestCovidStep.ContinuarTest();
	}

	@When("^ingresa primera opcion presenta sintomas$")
	public void ingresa_primera_opcion_presenta_sintomas() throws Throwable {

		RegistroTestCovidStep.PresentaSintomas();
	}

	@When("^ingresa primera opcion presenta sintomas de tos$")
	public void ingresa_primera_opcion_presenta_sintomas_de_tos() throws Throwable {

		RegistroTestCovidStep.PresentaSintomasTos();
	}

	@When("^ingresa primera opcion historial de enfermedades$")
	public void ingresa_primera_opcion_historial_de_enfermedades() throws Throwable {

		RegistroTestCovidStep.HistorialEnfermedades();
	}

	@When("^ingresa primera opcion contacto con personas congiadas$")
	public void ingresa_primera_opcion_contacto_con_personas_congiadas() throws Throwable {

		RegistroTestCovidStep.ContactoPersonasContagiadas();
	}

	@When("^Ingresa primera opcion ver centros medicos$")
	public void ingresa_primera_opcion_ver_centros_medicos() throws Throwable {

		RegistroTestCovidStep.CentrosMedicos();
	}

	@When("^Ingresa primera opcion bogota$")
	public void ingresa_primera_opcion_bogota() throws Throwable {

		RegistroTestCovidStep.CentroMedicoBogota();
	}

	@Then("^Ingresa segunda opcion (\\d+) salir$")
	public void ingresa_segunda_opcion_salir(int arg1) throws Throwable {

		RegistroTestCovidStep.Salir();
	}
}
