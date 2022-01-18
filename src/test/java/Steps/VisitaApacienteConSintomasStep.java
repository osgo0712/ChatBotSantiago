package Steps;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import PageObject.VisitaApacienteConSintomasPageObject;
import net.thucydides.core.annotations.Step;

public class VisitaApacienteConSintomasStep {

	VisitaApacienteConSintomasPageObject VisitaApacienteConSintomasPageObject;
	
	@Step
	public void abrirHome() {
		VisitaApacienteConSintomasPageObject.open();
	}
	
	@Step
	public void InicioSesion() throws InterruptedException, AWTException {
		VisitaApacienteConSintomasPageObject.InicioSesion();
	}
	
	@Step
	public void InicioConversacion() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		VisitaApacienteConSintomasPageObject.InicioConversacio();
	}

	@Step
	public void GestionVisitaApaciente() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		VisitaApacienteConSintomasPageObject.GestionVisitaApaciente();
	}
	
	@Step
	public void SeleccionClinica() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		VisitaApacienteConSintomasPageObject.VisitaAclinica();
	}
	
	@Step
	public void SeleccionCedulaPaciente() throws  InterruptedException, AWTException {
		VisitaApacienteConSintomasPageObject.SeleccionTipoDocumentoPaciente();
	}
	
	@Step
	public void IngresoNumeroDocumentoPaciente() throws  InterruptedException, AWTException {
		VisitaApacienteConSintomasPageObject.IngresoDocumentoPaciente();
	}
	
	@Step
	public void SeleccionCedulaVisitante() throws  InterruptedException, AWTException {
		VisitaApacienteConSintomasPageObject.IngresoTipoDocumentoVisitante();
	}
	
	@Step
	public void IngresoNumeroDocumentoVisitante() throws  InterruptedException, AWTException {
		VisitaApacienteConSintomasPageObject.IngresoNumeroDocumentoVisitante();
	}
	
	@Step
	public void NoPresentaSintomas() throws  InterruptedException, AWTException {
		VisitaApacienteConSintomasPageObject.NoPresentaSintomas();
	}
	
	@Step
	public void NoPresentaSintomas2() throws  InterruptedException, AWTException {
		VisitaApacienteConSintomasPageObject.NoPresentaSintomas2();
	}
	
	@Step
	public void NoPresentaSintomas3() throws  InterruptedException, AWTException {
		VisitaApacienteConSintomasPageObject.NoPresentaSintomas3();
	}
	
	@Step
	public void NoPresentaSintomas4() throws  InterruptedException, AWTException {
		VisitaApacienteConSintomasPageObject.NoPresentaSintomas4();
	}
	
	@Step
	public void NoPresentaSintomas5() throws  InterruptedException, AWTException {
		VisitaApacienteConSintomasPageObject.NoPresentaSintomas5();
	}
	
	@Step
	public void Salir() throws  InterruptedException, AWTException {
		VisitaApacienteConSintomasPageObject.Salir();
	}
	
}
