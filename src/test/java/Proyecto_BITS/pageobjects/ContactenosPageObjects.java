package Proyecto_BITS.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl ("https://bits-angular-stg.dev01.bitsamericas.net/inicio")

public class ContactenosPageObjects extends PageObject {
	
	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
	    getDriver().manage().window().maximize();
	    Thread.sleep(1000);
	}

	Properties loadProperty = new Properties();	
	
	//HOME
	static By Contactenos = ContactenosElements.btnContactenos.getValor_campo();
	
	//FORMULARIO
	static By CorreoElec = ContactenosElements.txtEmail.getValor_campo();
	static By Telefono = ContactenosElements.txtTelefono.getValor_campo();
	static By NombreCom = ContactenosElements.txtNombreC.getValor_campo();
	static By Organizacion = ContactenosElements.txtOrganizacion.getValor_campo();
	static By Pais = ContactenosElements.lstPais.getValor_campo();
	static By PaisText = ContactenosElements.txtPaisInput.getValor_campo();
	static By CiudadInput = ContactenosElements.txtCiudad.getValor_campo();
	static By Prueba2020 = ContactenosElements.txtPrueba.getValor_campo();
	static By Servicios = ContactenosElements.lstServicios.getValor_campo();
	static By ServiciosText = ContactenosElements.txtServiciosText.getValor_campo();	
	static By Productos = ContactenosElements.lstProductos.getValor_campo();
	static By ProductosText = ContactenosElements.txtProductosText.getValor_campo();		
	static By Coment = ContactenosElements.txtComentario.getValor_campo();
	static By Check = ContactenosElements.check.getValor_campo();
	static By Captcha = ContactenosElements.captcha.getValor_campo();
	static By Enviar = ContactenosElements.btnEnviar.getValor_campo();
	
	//HOME
	public void clickContactenos() throws InterruptedException {
	if (element(Contactenos).isDisplayed()) {
			Thread.sleep(1000);
			System.out.print("¡El acceso a la página de BITS es exitoso!");
			Thread.sleep(1000);
			find(Contactenos).click();
			Thread.sleep(1000);	
		}		
	}

	//FORMULARIO
	public void ingresaInformación() throws FileNotFoundException, IOException, InterruptedException, AWTException {
		Robot robot = new Robot();
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		loadProperty.load(new FileReader("./params.properties"));
		if (element(CorreoElec).isDisplayed()) {
			Thread.sleep(1000);
			System.out.print("¡El acceso a la pantalla de Contactenos es exitoso!");
			Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,700)");
            Thread.sleep(1000);
			find(CorreoElec).type(loadProperty.getProperty("Email"));
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);			
			find(Telefono).sendKeys("3100000000");
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			find(NombreCom).type(loadProperty.getProperty("NameC"));
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			find(Organizacion).sendKeys("BITS");
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			find(Pais).sendKeys("C");
			Thread.sleep(1000);
			find(PaisText).sendKeys("olombia");
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_TAB);
			find(CiudadInput).type(loadProperty.getProperty("Ciudad"));
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_TAB);
			find(Prueba2020).type(loadProperty.getProperty("Prueba"));
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			find(Servicios).sendKeys("C");
			Thread.sleep(1000);
			find(ServiciosText).sendKeys("loud");
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			find(Productos).sendKeys("O");
			Thread.sleep(1000);
			find(ProductosText).sendKeys("doo");
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_TAB);
			find(Coment).type(loadProperty.getProperty("Comentario"));
			//if (find(Check).isVisible()){
			//	find(Check).click();
				//}
			//Thread.sleep(1000);
			//robot.keyPress(KeyEvent.VK_TAB);
			//Thread.sleep(1000);
			//robot.keyPress(KeyEvent.VK_TAB);
			//Thread.sleep(1000);
			//find(Captcha).isSelected().click();
	}
	}

	public void clickEnviar() {
		System.out.println("No se realiza envio del formulario debido al captcha");
		
	}
	
	public void confirmaEnvío() {
		System.out.println("No se realiza envio del formulario debido al captcha");
	}

}