package PageObject;

import org.openqa.selenium.By;

public enum RegistroTestCovidElements {
	
	txtSearch (By.xpath("//input[contains(@class,'form-control')]")),
	SeleccionarSearch  (By.xpath("//div[contains(@class,'ListItem chat-item-clickable search-result no-selection')]")),
	btnRestart (By.xpath("//button[contains(@class,'Button tiny primary fluid has-ripple')]")),
	txtMensaje (By.xpath("//div[contains(@id,'editable-message-text')]")),
	txtMensajeRespuesta (By.xpath("//div[contains(@class,'Message message-list-item first-in-group last-in-group open shown')]")),
	body (By.xpath("//div[contains(@class,'mask-image-disabled')]")),
	btnOpcChat (By.xpath("//button[contains(@title,'More actions')]")),
	btnEliminar (By.xpath("//div[contains(@class,'MenuItem destructive')]")),
	btnConfirmarEliminar (By.xpath("//button[contains(@class,'Button confirm-dialog-button default danger text')]"));

	private By valor_campo;

	RegistroTestCovidElements(By valorCampo) {
		// TODO Auto-generated constructor stub
		this.setValor_campo(valorCampo);
	}

	public void setValor_campo(By valorCampo) {
		// TODO Auto-generated method stub
		this.valor_campo = valorCampo;
	}
	
	public By getValor_campo() {
		return valor_campo;
	}

}
