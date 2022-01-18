package Steps;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import PageObject.VisitaApacienteSinSintomasPageObject;
import net.thucydides.core.annotations.Step;

public class VisitaApacienteSinSintomasStep {

	VisitaApacienteSinSintomasPageObject VisitaApacienteSinSintomasPageObject;
	
	@Step
	public void abrirHome() {
		VisitaApacienteSinSintomasPageObject.open();
	}
	
	@Step
	public void InicioSesion() throws InterruptedException, AWTException {
		VisitaApacienteSinSintomasPageObject.InicioSesion();
	}
	
	@Step
	public void InicioConversacion() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		VisitaApacienteSinSintomasPageObject.InicioConversacio();
	}

	@Step
	public void GestionVisitaApaciente() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		VisitaApacienteSinSintomasPageObject.GestionVisitaApaciente();
	}
	
	@Step
	public void SeleccionClinica() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		VisitaApacienteSinSintomasPageObject.VisitaAclinica();
	}
	
	@Step
	public void SeleccionCedulaPaciente() throws  InterruptedException, AWTException {
		VisitaApacienteSinSintomasPageObject.SeleccionTipoDocumentoPaciente();
	}
	
	@Step
	public void IngresoNumeroDocumentoPaciente() throws  InterruptedException, AWTException {
		VisitaApacienteSinSintomasPageObject.IngresoDocumentoPaciente();
	}
	
	@Step
	public void SeleccionCedulaVisitante() throws  InterruptedException, AWTException {
		VisitaApacienteSinSintomasPageObject.IngresoTipoDocumentoVisitante();
	}
	
	@Step
	public void IngresoNumeroDocumentoVisitante() throws  InterruptedException, AWTException {
		VisitaApacienteSinSintomasPageObject.IngresoNumeroDocumentoVisitante();
	}
	
	@Step
	public void NoPresentaSintomas() throws  InterruptedException, AWTException {
		VisitaApacienteSinSintomasPageObject.NoPresentaSintomas();
	}
	
	@Step
	public void NoPresentaSintomas2() throws  InterruptedException, AWTException {
		VisitaApacienteSinSintomasPageObject.NoPresentaSintomas2();
	}
	
	@Step
	public void NoPresentaSintomas3() throws  InterruptedException, AWTException {
		VisitaApacienteSinSintomasPageObject.NoPresentaSintomas3();
	}
	
	@Step
	public void NoPresentaSintomas4() throws  InterruptedException, AWTException {
		VisitaApacienteSinSintomasPageObject.NoPresentaSintomas4();
	}
	
	@Step
	public void NoPresentaSintomas5() throws  InterruptedException, AWTException {
		VisitaApacienteSinSintomasPageObject.NoPresentaSintomas5();
	}
	
	@Step
	public void Salir() throws  InterruptedException, AWTException {
		VisitaApacienteSinSintomasPageObject.Salir();
	}
	
}
