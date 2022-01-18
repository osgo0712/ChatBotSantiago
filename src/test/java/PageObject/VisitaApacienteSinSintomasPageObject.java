package PageObject;

import net.serenitybdd.core.pages.PageObject;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl ("https://web.telegram.org/z/#752042350")

public class VisitaApacienteSinSintomasPageObject extends PageObject{
	
	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}
	
	//Inicializacion Objetos y Variables	
	int  objetoSiguiente= 2;
	Properties loadProperty = new Properties();	
	
	//HOME
	static By Search = AgendamientoCitaElements.txtSearch.getValor_campo();
	static By SeleccionarSearch = AgendamientoCitaElements.SeleccionarSearch.getValor_campo();
	static By BtnRestart = AgendamientoCitaElements.btnRestart.getValor_campo();
	static By TxtMensaje = AgendamientoCitaElements.txtMensaje.getValor_campo();
	static By TxtMensajeRespuesta = AgendamientoCitaElements.txtMensajeRespuesta.getValor_campo();
	static By Body = AgendamientoCitaElements.body.getValor_campo();
	static By BtnOpciones = AgendamientoCitaElements.btnOpcChat.getValor_campo();
	static By BtnEliminar = AgendamientoCitaElements.btnEliminar.getValor_campo();
	static By BtnConfiEliminar = AgendamientoCitaElements.btnConfirmarEliminar.getValor_campo();
	

	public void InicioSesion() throws InterruptedException, AWTException {
		
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		WebElement ConfirmacionSearch = getDriver().findElement(By.xpath("//input[contains(@class,'form-control')]"));   
		wait.until(ExpectedConditions.visibilityOf(ConfirmacionSearch));
		
		if(find(Search).isDisplayed()) {
			System.out.println("***Inicio de sesion exitoso***");
		}else {
			System.out.println("***Inicio de sesion fallido***");
		}	
	}
		
public void InicioConversacio() throws InterruptedException, AWTException, FileNotFoundException, IOException {
		
		loadProperty.load(new FileReader("./params.properties"));
		Robot robot = new Robot();
		//Consulta ChatBot
		find(Search).sendKeys("col");
		Thread.sleep(1000);
		find(Search).clear();
		find(Search).sendKeys("colsubsidiobot");
		Thread.sleep(3000);
		find(SeleccionarSearch).click();
		Thread.sleep(2000);

		if(element(BtnRestart).isVisible()) {
			find(BtnRestart).click();
			Thread.sleep(2000);
			
			/*-----------------------------------------------------------------------------------*/
			//Espera mensaje de respuesta por parte del bot
			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			WebElement MsjRecibido1 = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
			wait.until(ExpectedConditions.visibilityOf(MsjRecibido1));		
			//Variables de mensajes
			String MsjElemento1 = MsjRecibido1.getText();
			String MensajeLocal1 = loadProperty.getProperty("Msj1");	
			System.out.println(MsjElemento1);
			System.out.println(MensajeLocal1);
			assertThat(MsjElemento1, containsString(MensajeLocal1));
			/*-----------------------------------------------------------------------------------*/
			
			find(TxtMensaje).sendKeys("Hola");
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);	
			
			/*-----------------------------------------------------------------------------------*/
			//Espera mensaje de respuesta por parte del bot
			objetoSiguiente += 2;
			WebElement MsjRecibido2 = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
			wait.until(ExpectedConditions.visibilityOf(MsjRecibido2));	
			//Variables de mensaje
			String MsjElemento2 = MsjRecibido2.getText();
			String MensajeLocal2 = loadProperty.getProperty("Msj3");	
			//System.out.println(MsjElemento2);
			assertThat(MsjElemento2, containsString(MensajeLocal2));
			find(Body).click();
			/*-----------------------------------------------------------------------------------*/
		}else {
			
			find(BtnOpciones).click();
			Thread.sleep(2000);
			find(BtnEliminar).click();
			Thread.sleep(2000);
			find(BtnConfiEliminar).click();
			Thread.sleep(2000);
			//Busca de nuevo chat
			find(Search).sendKeys("col");
			Thread.sleep(1000);
			find(Search).clear();
			find(Search).sendKeys("colsubsidiobot");
			Thread.sleep(3000);
			find(SeleccionarSearch).click();
			Thread.sleep(2000);
			//Reinicio de chat
			find(BtnRestart).click();
			Thread.sleep(2000);
			/*-----------------------------------------------------------------------------------*/
			//Espera mensaje de respuesta por parte del bot
			WebDriverWait wait = new WebDriverWait(getDriver(),200);
			WebElement MsjRecibido1 = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
			wait.until(ExpectedConditions.visibilityOf(MsjRecibido1));		
			//Variables de mensajes
			String MsjElemento1 = MsjRecibido1.getText();
			String MensajeLocal1 = loadProperty.getProperty("Msj1");	
			//System.out.println(MsjElemento1);
			  assertThat(MsjElemento1, containsString(MensajeLocal1));
			/*-----------------------------------------------------------------------------------*/		
			
			//Mensaje de inicio
			find(TxtMensaje).sendKeys("Hola");
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			
			/*-----------------------------------------------------------------------------------*/
			//Espera mensaje de respuesta por parte del bot
			objetoSiguiente += 2;
			WebElement MsjRecibido2 = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
			wait.until(ExpectedConditions.visibilityOf(MsjRecibido2));	
			//Variables de mensaje
			String MsjElemento2 = MsjRecibido2.getText();
			String MensajeLocal2 = loadProperty.getProperty("Msj3");	
			//System.out.println(MsjElemento2);
			assertThat(MsjElemento2, containsString(MensajeLocal2));
			find(Body).click();
			/*-----------------------------------------------------------------------------------*/
			}
	}

	public void GestionVisitaApaciente() throws InterruptedException, AWTException, FileNotFoundException, IOException {
		
		loadProperty.load(new FileReader("./params.properties"));
		Robot robot = new Robot();
		find(TxtMensaje).sendKeys("6");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjSeleccionClinica");	
		assertThat(MsjElemento, containsString(MensajeLocal));

	}
	
	public void VisitaAclinica() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		if(element(TxtMensaje).isDisplayed()) {
		find(TxtMensaje).sendKeys("1");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		find(Body).click();
		
		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjTipoDocPaciente");	
		assertThat(MsjElemento, containsString(MensajeLocal));
		}
	}
	
	public void SeleccionTipoDocumentoPaciente() throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		if(element(TxtMensaje).isDisplayed()) {
		find(TxtMensaje).sendKeys("1");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		find(Body).click();
		
		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjNumeroDocPaciente");	
		assertThat(MsjElemento, containsString(MensajeLocal));
		
		}
	}
	
	public void IngresoDocumentoPaciente() throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		if(element(TxtMensaje).isDisplayed()) {
		find(TxtMensaje).sendKeys("53084100");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		find(Body).click();
		
		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjTipoDocVisitante");	
		assertThat(MsjElemento, containsString(MensajeLocal));
		}
	}
	
	public void IngresoTipoDocumentoVisitante() throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		if(element(TxtMensaje).isDisplayed()) {
		find(TxtMensaje).sendKeys("1");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		find(Body).click();
		
		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjNumeroDocVisitante");	
		assertThat(MsjElemento, containsString(MensajeLocal));
		}
	}
	
	public void IngresoNumeroDocumentoVisitante() throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		if(element(TxtMensaje).isDisplayed()) {
		find(TxtMensaje).sendKeys("53084100");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		find(Body).click();
		
		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjSintomasFiebre");	
		assertThat(MsjElemento, containsString(MensajeLocal));
		}
	}
	
	public void NoPresentaSintomas() throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		if(element(TxtMensaje).isDisplayed()) {
		find(TxtMensaje).sendKeys("2");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		find(Body).click();
		
		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjSintomasRespiratorios");	
		assertThat(MsjElemento, containsString(MensajeLocal));
		}
	}
	
	public void NoPresentaSintomas2() throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		if(element(TxtMensaje).isDisplayed()) {
		find(TxtMensaje).sendKeys("2");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		find(Body).click();
		
		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjContactoPersonasContagiadas");	
		assertThat(MsjElemento, containsString(MensajeLocal));

		}
	}
	
	public void NoPresentaSintomas3() throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		if(element(TxtMensaje).isDisplayed()) {
		find(TxtMensaje).sendKeys("2");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		find(Body).click();

		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjPruebaPositiva");	
		assertThat(MsjElemento, containsString(MensajeLocal));
		
		}
	}
	
	public void NoPresentaSintomas4() throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		if(element(TxtMensaje).isDisplayed()) {
		find(TxtMensaje).sendKeys("2");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		find(Body).click();

		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjVisitanteEnCuarentena");	
		assertThat(MsjElemento, containsString(MensajeLocal));
		}
	}
	
	public void NoPresentaSintomas5() throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		if(element(TxtMensaje).isDisplayed()) {
		find(TxtMensaje).sendKeys("2");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		find(Body).click();
		
		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjResultadoTestVisitanteSinCovid");	
		assertThat(MsjElemento, containsString(MensajeLocal));
		}
	}
	
	
	public void Salir() throws InterruptedException, AWTException {
		
		Robot robot = new Robot();
		find(TxtMensaje).sendKeys("2");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//Espera a que llegue el mensaje recibido por la peticion
		WebDriverWait wait = new WebDriverWait(getDriver(),200);
		objetoSiguiente += 2;
		WebElement MsjRecibido = getDriver().findElement(By.xpath("(//div[contains(@class,'message-content-wrapper can-select-text')])[position()="+objetoSiguiente+"]"));   
		wait.until(ExpectedConditions.visibilityOf(MsjRecibido));
		find(Body).click();
		
		//Variables de mensaje
		String MsjElemento = MsjRecibido.getText();
		String MensajeLocal = loadProperty.getProperty("MsjDespedida");	
		assertThat(MsjElemento, containsString(MensajeLocal));
		
	}
	

}
