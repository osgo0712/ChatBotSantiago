package Definitions;

import Steps.AgendamientoCitaStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AgendamientoCitaDefinition {
	
	@Steps
	AgendamientoCitaStep AgendamientoCitaStep;
	
	@Given("^El usuario se encuentra en telegram$")
	public void el_usuario_se_encuentra_en_telegram() throws Throwable {
		
		AgendamientoCitaStep.abrirHome();
	}
	
	@When("^Realiza inicio de sesion en telegram por medio de codigo QR$")
	public void realiza_inicio_de_sesion_en_telegram_por_medio_de_codigo_QR() throws Throwable {
		
		AgendamientoCitaStep.InicioSesion();
	}
	
	@When("^Hace click en la opcion search y consulta @ColsubsidioBot e inicia conversacion desde cero con mensaje hola$")
	public void hace_click_en_la_opcion_search_y_consulta_ColsubsidioBot() throws Throwable {
		
		AgendamientoCitaStep.InicioConversacion();
	}

	@When("^Ingresa opcion (\\d+)\\.Gestiona tus citas$")
	public void ingresa_opcion_Gestiona_tus_citas(int arg1) throws Throwable {
		
		AgendamientoCitaStep.GestionaCita();
	}

	@When("^Ingresa opcion (\\d+)\\.CC$")
	public void ingresa_opcion_CC(int arg1) throws Throwable {
		AgendamientoCitaStep.SeleccionCedula();
	}

	@When("^Ingresa numero de idetinficacion$")
	public void ingresa_numero_de_idetinficacion() throws Throwable {
		AgendamientoCitaStep.IngresoNumeroDocumento();
	}

	@When("^Ingresa fecha de nacimiento$")
	public void ingresa_fecha_de_nacimiento() throws Throwable {
		AgendamientoCitaStep.IngresoFechaNacimiento();
	}

	@When("^ingresa opcion (\\d+)\\.Si confirmacion de datos$")
	public void ingresa_opcion_Si_confirmacion_de_datos(int arg1) throws Throwable {
		
		AgendamientoCitaStep.ConfirmacionDatos();
	}

	@When("^Ingresa opcion (\\d+)\\.Agendar$")
	public void ingresa_opcion_Agendar(int arg1) throws Throwable {
		
		AgendamientoCitaStep.Agendamiento();
	}

	@When("^Ingresa opcion (\\d+)\\.Medicina general$")
	public void ingresa_opcion_Medicina_general(int arg1) throws Throwable {
		
		AgendamientoCitaStep.OpcionMedicinaGeneral();
	}

	@When("^Ingresa opcion (\\d+)\\.Consulta presencial$")
	public void ingresa_opcion_Consulta_presencial(int arg1) throws Throwable {
		
		AgendamientoCitaStep.ConsultaPresencial();
	}

	@When("^Ingresa opcion (\\d+)\\.Agendar en zonas$")
	public void ingresa_opcion_AgendaR_en_zonas(int arg1) throws Throwable {
		
		AgendamientoCitaStep.AgendamientoEnZona();
	}

	@When("^Ingresa opcion (\\d+)\\.Bogota zona centro oriente$")
	public void ingresa_opcion_Bogota_zona_centro_oriente(int arg1) throws Throwable {
		
		AgendamientoCitaStep.AgendamientoBogotaZonaCentro();
	}

	@When("^Ingresa opcion (\\d+)\\.Cm calle (\\d+)$")
	public void ingresa_opcion_Cm_calle(int arg1, int arg2) throws Throwable {
		
		AgendamientoCitaStep.AgendamientoBogotaCll26();
	}

	@When("^Ingresa opcion (\\d+)\\.Zona horaria mañana$")
	public void ingresa_opcion_Zona_horaria_mañana(int arg1) throws Throwable {
	    
		AgendamientoCitaStep.AgendamientoZonaHorariaAM();
	}

	@When("^Ingresa opcion (\\d+)\\.Mes actual$")
	public void ingresa_opcion_Mes_actual(int arg1) throws Throwable {
	   
		AgendamientoCitaStep.AgendamientoMesActual();
	}

	@When("^Ingresa opcion (\\d+)\\.Primer dia con disponibilidad$")
	public void ingresa_opcion_Primer_dia_con_disponibilidad(int arg1) throws Throwable {
	    
		AgendamientoCitaStep.AgendamientoDiaDisponibilidad();
	}

	@When("^Ingresa opcion (\\d+)\\.Primer horario con disponibilidad$")
	public void ingresa_opcion_Primer_horario_con_disponibilidad(int arg1) throws Throwable {
	    
		AgendamientoCitaStep.AgendamientoHorarioDisponibilidad();
	}

	@When("^Ingresa opcion (\\d+)\\.Confirmacion de cita medica$")
	public void ingresa_opcion_Confirmacion_de_cita_medica(int arg1) throws Throwable {
		AgendamientoCitaStep.ConfirmacionAgendamiento();
	}
	
	@Then("^Ingresa opcion (\\d+)\\.Salir$")
	public void ingresa_opcion_salir(int arg1) throws Throwable {
		AgendamientoCitaStep.SalirFlujo();
	}

}
