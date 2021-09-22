Feature: Página Bits
  Como usuario quiero registrarme para participar en proyectos y consultar los servicios ofrecidos por bits


Scenario: Ingresar al modulo de contactenos desde el home y realizar un registro
    Given 	El usuario se encuentra en el home de Bits
    When 		Hace click en el botón contactenos
    And 		Ingresa la informacion obligatoria del formulario start a project
    And 		Hace clic en Enviar    
    Then 		Confirma envio
    
    

