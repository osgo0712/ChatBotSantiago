package Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.EliminarCitaStep;

public class EliminarCitaDefinition {
	
	@Steps
	EliminarCitaStep EliminarCitaStep;
	
	@Given("^El usuario se encuentra en la app telegram$")
	public void el_usuario_se_encuentra_en_la_app_telegram() throws Throwable {
		EliminarCitaStep.AbrirHome();

	}

	@When("^Realiza inicio de sesion por medio de codigo QR$")
	public void realiza_inicio_de_sesion_por_medio_de_codigo_QR() throws Throwable {
		EliminarCitaStep.IniciarSesion();

	}

	@When("^Hace click en la opcion buscar y consulta @ColsubsidioBot e inicia conversacion desde cero con mensaje hola$")
	public void hace_click_en_la_opcion_buscar_y_consulta_ColsubsidioBot_e_inicia_conversacion_desde_cero_con_mensaje_hola() throws Throwable {
		EliminarCitaStep.IniciarConversacion();

	}

	@When("^Ingresa primera opcion gestiona tus citas$")
	public void ingresa_primera_opcion_gestiona_tus_citas() throws Throwable {
		EliminarCitaStep.GestionCita();

	}

	@When("^Ingresa primera opcion tipo de cocumento CC$")
	public void ingresa_primera_opcion_tipo_de_cocumento_CC() throws Throwable {

		EliminarCitaStep.SeleccionTipoDocumento();
	}

	@When("^Ingresa numero de idetinficacion correspondiente$")
	public void ingresa_numero_de_idetinficacion_correspondiente() throws Throwable {

		EliminarCitaStep.IngresoNumeroDocumento();
	}

	@When("^Ingresa fecha de nacimiento del usuario$")
	public void ingresa_fecha_de_nacimiento_del_usuario() throws Throwable {

		EliminarCitaStep.IngresoFechaNacimiento();
	}

	@When("^ingresa primera opcion confirmacion de datos$")
	public void ingresa_primera_opcion_confirmacion_de_datos() throws Throwable {

		EliminarCitaStep.ConfirmacionDatos();
	}

	@When("^Ingresa primera opcion eliminar$")
	public void ingresa_primera_opcion_eliminar() throws Throwable {

		EliminarCitaStep.EliminacionCita();
	}

	@When("^Ingresa primera opcion Confirmar Cita$")
	public void ingresa_primera_opcion_Confirmar_Cita() throws Throwable {

		EliminarCitaStep.ConfirmacionCitaEliminada();
	}

	@When("^Ingresa primera opcion Confirmar Fecha$")
	public void ingresa_primera_opcion_Confirmar_Fecha() throws Throwable {

		EliminarCitaStep.ConfirmacionFechaNacimiento();
	}

	@When("^Ingresa primera opcion Confirmar Eliminacion$")
	public void ingresa_primera_opcion_Confirmar_Eliminacion() throws Throwable {

		EliminarCitaStep.ConfirmarEliminacion();
	}

	@When("^Ingresa segunda opcion Salir Flujo$")
	public void ingresa_primera_opcion_Salir_Flujo() throws Throwable {
		
		EliminarCitaStep.SalirFlujo();

	}

	@Then("^Ingresa segunda opcion salir$")
	public void ingresa_segunda_opcion_salir() throws Throwable {
		
		EliminarCitaStep.Salir();
	}
	
}
