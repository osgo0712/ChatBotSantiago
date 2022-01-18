package Steps;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import PageObject.RegistroTestCovidPageObject;
import net.thucydides.core.annotations.Step;

public class RegistroTestCovidStep {

	RegistroTestCovidPageObject RegistroTestCovidPageObject;
	
	@Step
	public void abrirHome() {
		RegistroTestCovidPageObject.open();
	}
	
	@Step
	public void InicioSesion() throws InterruptedException, AWTException {
		RegistroTestCovidPageObject.InicioSesion();
	}
	
	@Step
	public void InicioConversacion() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.InicioConversacio();
	}

	@Step
	public void TestCovid() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.TestCovid();
	}
	
	@Step
	public void SeleccionCedula() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.SeleccionTipoDocumento();
	}
	
	@Step
	public void IngresoNumeroDocumento() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.IngresoDocumento();
	}
	
	@Step
	public void ContinuarTest() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.ContinuarTest();
	}
	
	@Step
	public void PresentaSintomas() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.PresentaSintomas();
	}
	
	@Step
	public void PresentaSintomasTos() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.PresentaSintomasTos();
	}
	
	
	@Step
	public void HistorialEnfermedades() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.HistorialEnfermedades();
	}
	
	@Step
	public void ContactoPersonasContagiadas() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.ContactoPersonasContagiadas();
	}
	
	@Step
	public void CentrosMedicos() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.CentrosMedicos();
	}
	
	@Step
	public void CentroMedicoBogota() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.CentroMedicoBogota();
	}
	
	@Step
	public void Salir() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestCovidPageObject.Salir();
	}
	
}

