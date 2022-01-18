package Steps;

import net.thucydides.core.annotations.Step;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import PageObject.EliminarCitaPageObject;

public class EliminarCitaStep {

	EliminarCitaPageObject EliminarCitaPageObject;
	
	@Step
	public void AbrirHome() {
		EliminarCitaPageObject.open();
	}
	
	@Step
	public void IniciarSesion() throws InterruptedException, AWTException {
		EliminarCitaPageObject.InicioSesion();
	}
	
	@Step
	public void IniciarConversacion() throws InterruptedException, AWTException, FileNotFoundException, IOException {
		EliminarCitaPageObject.InicioConversacio();
	}
	
	@Step
	public void GestionCita() throws FileNotFoundException, InterruptedException, AWTException, IOException {
		EliminarCitaPageObject.GestionCita();
	}
	
	@Step
	public void SeleccionTipoDocumento() throws InterruptedException, AWTException {
		EliminarCitaPageObject.SeleccionTipoDocumento();
	}
	
	@Step
	public void IngresoNumeroDocumento() throws InterruptedException, AWTException {
		EliminarCitaPageObject.IngresoDocumento();
	}
	
	@Step
	public void IngresoFechaNacimiento() throws InterruptedException, AWTException {
		EliminarCitaPageObject.IngresoFechaNacimiento();
	}
	
	@Step
	public void ConfirmacionDatos() throws InterruptedException, AWTException {
		EliminarCitaPageObject.ConfirmacionDtos();
	}
	
	@Step
	public void EliminacionCita() throws InterruptedException, AWTException {
		EliminarCitaPageObject.EliminacionCita();
	}
	
	@Step
	public void ConfirmacionCitaEliminada() throws InterruptedException, AWTException {

		EliminarCitaPageObject.ConfirmacionCita();
	}
	
	@Step
	public void ConfirmacionFechaNacimiento() throws InterruptedException, AWTException {
		EliminarCitaPageObject.ConfirmacionFecha();
	}
	
	@Step
	public void ConfirmarEliminacion() throws InterruptedException, AWTException {
		EliminarCitaPageObject.ConfirmarEliminacion();
	}
	
	@Step
	public void SalirFlujo() throws InterruptedException, AWTException {
		EliminarCitaPageObject.SalirFlujo();
	}
	
	@Step
	public void Salir() throws InterruptedException, AWTException {
		EliminarCitaPageObject.Salir();
		
	}
	
}

