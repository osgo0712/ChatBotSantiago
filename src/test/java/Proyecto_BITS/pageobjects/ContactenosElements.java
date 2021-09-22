package Proyecto_BITS.pageobjects;

import org.openqa.selenium.By;

public enum ContactenosElements {
	
		//HOME
		btnContactenos (By.xpath("//*[@id=\"block-navbar\"]/nav/div/ul[1]/li[6]/a")),
		
		//FORMULARIO
		txtEmail (By.xpath("//*[@id=\"contact_us__correo_electronico\"]")),
		txtTelefono(By.xpath("//*[@id=\"contact_us__telefono\"]")),
		txtNombreC (By.xpath("//*[@id=\"contact_us__nombre\"]")),
		txtOrganizacion (By.xpath("//*[@id=\"contact_us__organizacion\"]")),
		lstPais (By.xpath("//*[@id=\"contact_us__pais\"]/div/div[2]/span")),
		txtPaisInput (By.xpath("//*[@id=\"contact_us__pais\"]/div/input")),
		txtCiudad (By.xpath("//*[@id=\"contact_us__ciudad\"]")),
		txtPrueba (By.xpath("//*[@id=\"contact_us__prueba2020\"]")),
		lstServicios(By.xpath("//*[@id=\"contact_us__servicios_de_interes\"]/div/div[2]/span")),
		txtServiciosText (By.xpath("//*[@id=\"contact_us__servicios_de_interes\"]/div/input")),
		lstProductos(By.xpath("//*[@id=\"contact_us__productos_de_interes\"]/div/div[2]/span")),
		txtProductosText (By.xpath("//*[@id=\"contact_us__productos_de_interes\"]/div/input")),
		txtComentario (By.xpath("//*[@id=\"contact_us__comentario\"]")),
		btnEnviar (By.xpath("//*[@id=\"formulario_contacto\"]/button")),
		check (By.xpath("//form[@id='formulario_contacto']/div/div[11]/label")),
		captcha (By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
/*		
		//CONFIRMACIÓN REGISTRO
		lblmsgConfirm (By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
*/				

		private By valor_campo;

		ContactenosElements(By valorCampo) {
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