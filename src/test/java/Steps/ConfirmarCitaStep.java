package Steps;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import PageObject.ConfirmarCitaPageObject;
import net.thucydides.core.annotations.Step;

public class ConfirmarCitaStep {
	
	ConfirmarCitaPageObject ConfirmarCitaPageObject;

	@Step
	public void abrirHome() {
		ConfirmarCitaPageObject.open();
	}
	
	@Step
	public void InicioSesion() throws InterruptedException, AWTException {
		ConfirmarCitaPageObject.InicioSesion();
	}
	
	@Step
	public void InicioConversacion() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		ConfirmarCitaPageObject.InicioConversacio();
	}

	@Step
	public void GestionaCita() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		ConfirmarCitaPageObject.GestionCita();
	}
	
	@Step
	public void SeleccionCedula() throws  InterruptedException, AWTException {
		ConfirmarCitaPageObject.SeleccionTipoDocumento();
	}
	
	@Step
	public void IngresoNumeroDocumento() throws  InterruptedException, AWTException {
		ConfirmarCitaPageObject.IngresoDocumento();
	}
	
	@Step
	public void IngresoFechaNacimiento() throws  InterruptedException, AWTException {
		ConfirmarCitaPageObject.IngresoFechaNacimiento();
	}
	
	@Step
	public void ConfirmacionDatos() throws  InterruptedException, AWTException {
		ConfirmarCitaPageObject.ConfirmacionDtos();
	}
	
	@Step
	public void Confirmar() throws  InterruptedException, AWTException {
		ConfirmarCitaPageObject.Confirmar();
	}
	
	@Step
	public void Salir() throws  InterruptedException, AWTException {
		ConfirmarCitaPageObject.Salir();
	}
	
}
