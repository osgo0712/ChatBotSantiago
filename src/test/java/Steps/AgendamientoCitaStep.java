package Steps;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import PageObject.AgendamientoCitaPageObject;
import net.thucydides.core.annotations.Step;

public class AgendamientoCitaStep {
	
	AgendamientoCitaPageObject AgendamientoCitaPageObject;

	@Step
	public void abrirHome() {
		AgendamientoCitaPageObject.open();
	}
	
	@Step
	public void InicioSesion() throws InterruptedException, AWTException {
		AgendamientoCitaPageObject.InicioSesion();
	}
	
	@Step
	public void InicioConversacion() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		AgendamientoCitaPageObject.InicioConversacio();
	}

	@Step
	public void GestionaCita() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		AgendamientoCitaPageObject.GestionCita();
	}
	
	@Step
	public void SeleccionCedula() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.SeleccionTipoDocumento();
	}
	
	@Step
	public void IngresoNumeroDocumento() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.IngresoDocumento();
	}
	
	@Step
	public void IngresoFechaNacimiento() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.IngresoFechaNacimiento();
	}
	
	@Step
	public void ConfirmacionDatos() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.ConfirmacionDtos();
	}
	
	@Step
	public void Agendamiento() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.Agendamiento();
	}
	
	@Step
	public void OpcionMedicinaGeneral() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.AgendamientoMedicinaGeneral();
	}
	
	@Step
	public void ConsultaPresencial() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.AgendamientoConsultaPresencial();
	}
	
	@Step
	public void AgendamientoEnZona() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.AgendamientoPorZonas();
	}
	
	@Step
	public void AgendamientoBogotaZonaCentro() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.AgendamientoPorZonaCentro();
	}
	
	@Step
	public void AgendamientoBogotaCll26() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.AgendamientoPorCMCll26();
	}
	
	@Step
	public void AgendamientoZonaHorariaAM() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.AgendamientoZonaHorariaMañana();
	}
	
	@Step
	public void AgendamientoMesActual() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.AgendamientoMesActual();
	}
	
	@Step
	public void AgendamientoDiaDisponibilidad() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.AgendamientoDiaDisponibilidad();
	}
	
	@Step
	public void AgendamientoHorarioDisponibilidad() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.AgendamientoHorarioDisponibilidad();
	}
	
	@Step
	public void ConfirmacionAgendamiento() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.ConfirmacionAgendamiento();
	}
	
	@Step
	public void SalirFlujo() throws  InterruptedException, AWTException {
		AgendamientoCitaPageObject.Salir();
	}
}
