package Proyecto_BITS.steps;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import Proyecto_BITS.pageobjects.ContactenosPageObjects;
import net.thucydides.core.annotations.Step;

public class ContactenosSteps {
	
	ContactenosPageObjects ContactenosPageObjects;

	@Step
	public void abrirHome() {
		ContactenosPageObjects.open();		
	}

	@Step
	public void clickContactenos() throws InterruptedException {
		ContactenosPageObjects.clickContactenos();		
	}

	@Step
	public void ingresaInformación() throws FileNotFoundException, IOException, InterruptedException, AWTException {
		ContactenosPageObjects.ingresaInformación();		
	}

	@Step
	public void clickEnviar() {
		ContactenosPageObjects.clickEnviar();	
	}

	@Step
	public void confirmaEnvío() {
		ContactenosPageObjects.confirmaEnvío();		
	}

}
