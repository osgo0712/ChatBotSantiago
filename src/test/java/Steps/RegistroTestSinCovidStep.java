package Steps;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import PageObject.RegistroTestSinCovidPageObject;
import net.thucydides.core.annotations.Step;

public class RegistroTestSinCovidStep {
	
	RegistroTestSinCovidPageObject RegistroTestSinCovidPageObject;

	@Step
	public void abrirHome() {
		RegistroTestSinCovidPageObject.open();
	}
	
	@Step
	public void InicioSesion() throws InterruptedException, AWTException {
		RegistroTestSinCovidPageObject.InicioSesion();
	}
	
	@Step
	public void InicioConversacion() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestSinCovidPageObject.InicioConversacio();
	}

	@Step
	public void TestCovid() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestSinCovidPageObject.TestCovid();
	}
	
	@Step
	public void SeleccionCedula() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestSinCovidPageObject.SeleccionTipoDocumento();
	}
	
	@Step
	public void IngresoNumeroDocumento() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestSinCovidPageObject.IngresoDocumento();
	}
	
	@Step
	public void ContinuarTest() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestSinCovidPageObject.ContinuarTest();
	}
	
	@Step
	public void NoPresentaSintomas() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestSinCovidPageObject.NoPresentaSintomas();
	}
	
	@Step
	public void NoPresentaSintomasTos() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestSinCovidPageObject.NoPresentaSintomasTos();
	}
	
	
	@Step
	public void SinHistorialEnfermedades() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestSinCovidPageObject.SinHistorialEnfermedades();
	}
	
	@Step
	public void SinContactoPersonasContagiadas() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestSinCovidPageObject.SinContactoPersonasContagiadas();
	}
	
	@Step
	public void Salir() throws  InterruptedException, AWTException, FileNotFoundException, IOException {
		RegistroTestSinCovidPageObject.Salir();
	}
}
