package Definitions;

import net.thucydides.core.annotations.Steps;
import Steps.VisitaApacienteSinSintomasStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VisitaApacienteSinSintomasDefinition {

	@Steps
	VisitaApacienteSinSintomasStep VisitaApacienteSinSintomasStep;
	
	@Given("^El usuario se encuentra en pagina de telegram$")
	public void el_usuario_se_encuentra_en_pagina_de_telegram() throws Throwable {

		VisitaApacienteSinSintomasStep.abrirHome();
	}

	@When("^Realiza inicio de sesion por medio de cod QR$")
	public void realiza_inicio_de_sesion_por_medio_de_cod_QR() throws Throwable {

		VisitaApacienteSinSintomasStep.InicioSesion();
	}

	@When("^Consultar en opcion de busqueda @ColsubsidioBot e inicia conversacion desde cero con mensaje hola$")
	public void consultar_en_opcion_de_busqueda_ColsubsidioBot_e_inicia_conversacion_desde_cero_con_mensaje_hola() throws Throwable {

		VisitaApacienteSinSintomasStep.InicioConversacion();
	}

	@When("^Ingresa sexta opcion Test de riesgo CORONAVIRUS COVID(\\d+)$")
	public void ingresa_sexta_opcion_Test_de_riesgo_CORONAVIRUS_COVID(int arg1) throws Throwable {

		VisitaApacienteSinSintomasStep.GestionVisitaApaciente();
	}

	@When("^Ingresa primera opcion Clinica$")
	public void ingresa_primera_opcion_Clinica() throws Throwable {

		VisitaApacienteSinSintomasStep.SeleccionClinica();
	}

	@When("^Ingresa primera opcion (\\d+)\\.cedula de ciudadania paciente$")
	public void ingresa_primera_opcion_cedula_de_ciudadania_paciente(int arg1) throws Throwable {

		VisitaApacienteSinSintomasStep.SeleccionCedulaPaciente();
	}

	@When("^Ingresa numero de documento del paciente a visitar$")
	public void ingresa_numero_de_documento_del_paciente_a_visitar() throws Throwable {

		VisitaApacienteSinSintomasStep.IngresoNumeroDocumentoPaciente();
	}

	@When("^ingresa primera opcion cedula de ciudadania del visitante$")
	public void ingresa_primera_opcion_cedula_de_ciudadania_del_visitante() throws Throwable {

		VisitaApacienteSinSintomasStep.SeleccionCedulaVisitante();
	}

	@When("^ingresa numero de documento del visitante$")
	public void ingresa_numero_de_documento_del_visitante() throws Throwable {

		VisitaApacienteSinSintomasStep.IngresoNumeroDocumentoVisitante();
	}

	@When("^ingresa segunda opcion (\\d+)\\.no presenta sintomas de fiebre$")
	public void ingresa_segunda_opcion_no_presenta_sintomas_de_fiebre(int arg1) throws Throwable {

		VisitaApacienteSinSintomasStep.NoPresentaSintomas();
	}

	@When("^ingresa segunda opcion (\\d+)\\.no presenta sintomas de tos$")
	public void ingresa_segunda_opcion_no_presenta_sintomas_de_tos(int arg1) throws Throwable {

		VisitaApacienteSinSintomasStep.NoPresentaSintomas2();
	}

	@When("^ingresa segunda opcion (\\d+)\\.contacto con personas contagiadas$")
	public void ingresa_segunda_opcion_contacto_con_personas_contagiadas(int arg1) throws Throwable {

		VisitaApacienteSinSintomasStep.NoPresentaSintomas3();
	}

	@When("^ingresa segunda opcion (\\d+)\\.test de prueba para covid positivo$")
	public void ingresa_segunda_opcion_test_de_prueba_para_covid_positivo(int arg1) throws Throwable {

		VisitaApacienteSinSintomasStep.NoPresentaSintomas4();
	}

	@When("^ingresa segunda opcion (\\d+)\\.has estado en cuarentena$")
	public void ingresa_segunda_opcion_has_estado_en_cuarentena(int arg1) throws Throwable {

		VisitaApacienteSinSintomasStep.NoPresentaSintomas5();
	}

	@Then("^Ingresa segunda (\\d+)\\.opc salir$")
	public void ingresa_segunda_opc_salir(int arg1) throws Throwable {

		VisitaApacienteSinSintomasStep.Salir();
	}
}