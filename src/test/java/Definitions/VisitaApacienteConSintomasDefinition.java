package Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.VisitaApacienteConSintomasStep;

public class VisitaApacienteConSintomasDefinition {

	@Steps
	VisitaApacienteConSintomasStep VisitaApacienteConSintomasStep;
	
	@Given("^El usuario se encuentra en pagina web de telegram$")
	public void el_usuario_se_encuentra_en_pagina_web_de_telegram() throws Throwable {

		VisitaApacienteConSintomasStep.abrirHome();
	}

	@When("^Realiza inicio de sesion por medio de QR$")
	public void realiza_inicio_de_sesion_por_medio_de_QR() throws Throwable {

		VisitaApacienteConSintomasStep.InicioSesion();
	}

	@When("^Consultar en opcion search @ColsubsidioBot e inicia conversacion desde cero con mensaje hola$")
	public void consultar_en_opcion_search_ColsubsidioBot_e_inicia_conversacion_desde_cero_con_mensaje_hola() throws Throwable {

		VisitaApacienteConSintomasStep.InicioConversacion();
	}

	@When("^Ingresa sexta opcion (\\d+)\\.Test de riesgo CORONAVIRUS COVID(\\d+)$")
	public void ingresa_sexta_opcion_Test_de_riesgo_CORONAVIRUS_COVID(int arg1, int arg2) throws Throwable {

		VisitaApacienteConSintomasStep.GestionVisitaApaciente();
	}

	@When("^Ingresa primera opcion (\\d+)\\.Clinica$")
	public void ingresa_primera_opcion_Clinica(int arg1) throws Throwable {

		VisitaApacienteConSintomasStep.SeleccionClinica();
	}

	@When("^Ingresa primera opcion cedula de ciudadania paciente$")
	public void ingresa_primera_opcion_cedula_de_ciudadania_paciente() throws Throwable {

		VisitaApacienteConSintomasStep.SeleccionCedulaPaciente();
	}

	@When("^Ingresa numero de documento paciente$")
	public void ingresa_numero_de_documento_paciente() throws Throwable {

		VisitaApacienteConSintomasStep.IngresoNumeroDocumentoPaciente();
	}

	@When("^ingresa primera opcion cedula de ciudadania visitante$")
	public void ingresa_primera_opcion_cedula_de_ciudadania_visitante() throws Throwable {

		VisitaApacienteConSintomasStep.SeleccionCedulaVisitante();
	}

	@When("^ingresa numero de documento visitante$")
	public void ingresa_numero_de_documento_visitante() throws Throwable {

		VisitaApacienteConSintomasStep.IngresoNumeroDocumentoVisitante();
	}

	@When("^ingresa primera opcion (\\d+)\\.no presenta sintomas de fiebre$")
	public void ingresa_primera_opcion_no_presenta_sintomas_de_fiebre(int arg1) throws Throwable {

		VisitaApacienteConSintomasStep.NoPresentaSintomas();
	}

	@When("^ingresa primera opcion (\\d+)\\.no presenta sintomas de tos$")
	public void ingresa_primera_opcion_no_presenta_sintomas_de_tos(int arg1) throws Throwable {

		VisitaApacienteConSintomasStep.NoPresentaSintomas2();
	}

	@When("^ingresa primera opcion (\\d+)\\.contacto con personas contagiadas$")
	public void ingresa_primera_opcion_contacto_con_personas_contagiadas(int arg1) throws Throwable {

		VisitaApacienteConSintomasStep.NoPresentaSintomas3();
	}

	@When("^ingresa primera opcion (\\d+)\\.test de prueba para covid positivo$")
	public void ingresa_primera_opcion_test_de_prueba_para_covid_positivo(int arg1) throws Throwable {

		VisitaApacienteConSintomasStep.NoPresentaSintomas4();
	}

	@When("^ingresa primera opcion (\\d+)\\.has estado en cuarentena$")
	public void ingresa_primera_opcion_has_estado_en_cuarentena(int arg1) throws Throwable {

		VisitaApacienteConSintomasStep.NoPresentaSintomas5();
	}

	@Then("^Ingresa segunda (\\d+)\\.opcion salir$")
	public void ingresa_segunda_opcion_salir(int arg1) throws Throwable {

		VisitaApacienteConSintomasStep.Salir();
	}
}
