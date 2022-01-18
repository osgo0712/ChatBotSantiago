#Escenario 2
Feature: ChatBot santiago
  Como usuario deseo eliminar agendamiento de una de cita medica presencial.
  	
		
  Scenario: Ingresar al chatbot santiago desde telegram y realizar eliminacion de una de cita medica presencial
    Given El usuario se encuentra en la app telegram
    When Realiza inicio de sesion por medio de codigo QR
    And Hace click en la opcion buscar y consulta @ColsubsidioBot e inicia conversacion desde cero con mensaje hola
    And Ingresa primera opcion gestiona tus citas
    And Ingresa primera opcion tipo de cocumento CC
    And Ingresa numero de idetinficacion correspondiente
    And Ingresa fecha de nacimiento del usuario
    And ingresa primera opcion confirmacion de datos
    And Ingresa primera opcion eliminar
    And Ingresa primera opcion Confirmar Cita
    And Ingresa primera opcion Confirmar Fecha
    And Ingresa primera opcion Confirmar Eliminacion
    And Ingresa segunda opcion Salir Flujo
    Then Ingresa segunda opcion salir