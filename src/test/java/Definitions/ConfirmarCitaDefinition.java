package Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.ConfirmarCitaStep;

public class ConfirmarCitaDefinition {
	
	@Steps
	ConfirmarCitaStep ConfirmarCitaStep;

	
	@Given("^El usuario se encuentra en app telegram$")
	public void el_usuario_se_encuentra_en_app_telegram() throws Throwable {

		ConfirmarCitaStep.abrirHome();
	}

	@When("^Realiza inicio de sesion en app telegram por medio de codigo QR$")
	public void realiza_inicio_de_sesion_en_app_telegram_por_medio_de_codigo_QR() throws Throwable {

		ConfirmarCitaStep.InicioSesion();
	}

	@When("^Hace click en search y consulta @ColsubsidioBot e inicia conversacion desde cero con mensaje hola$")
	public void hace_click_en_search_y_consulta_ColsubsidioBot_e_inicia_conversacion_desde_cero_con_mensaje_hola() throws Throwable {

		ConfirmarCitaStep.InicioConversacion();
	}

	@When("^Ingresa primera opcion Gestiona tus citas$")
	public void ingresa_primera_opcion_Gestiona_tus_citas() throws Throwable {

		ConfirmarCitaStep.GestionaCita();
	}

	@When("^Ingresa primera opcion tipo de documento CC$")
	public void ingresa_primera_opcion_tipo_de_documento_CC() throws Throwable {

		ConfirmarCitaStep.SeleccionCedula();
	}

	@When("^Ingresa numero de cedula de ciudadania$")
	public void ingresa_numero_de_cedula_de_ciudadania() throws Throwable {

		ConfirmarCitaStep.IngresoNumeroDocumento();
	}

	@When("^Ingresa fecha de nacimiento correspondiente al usuario$")
	public void ingresa_fecha_de_nacimiento_correspondiente_al_usuario() throws Throwable {

		ConfirmarCitaStep.IngresoFechaNacimiento();
	}

	@When("^ingresa primera opcion (\\d+)\\.Si, confirmacion de datos$")
	public void ingresa_primera_opcion_Si_confirmacion_de_datos(int arg1) throws Throwable {

		ConfirmarCitaStep.ConfirmacionDatos();
	}

	@When("^Ingresa opcion (\\d+)\\.Confirmar$")
	public void ingresa_opcion_Confirmar(int arg1) throws Throwable {

		ConfirmarCitaStep.Confirmar();
	}

	@Then("^Ingresa mensaje chao$")
	public void ingresa_mensaje_chao() throws Throwable {

		ConfirmarCitaStep.Salir();
	}
	
}
