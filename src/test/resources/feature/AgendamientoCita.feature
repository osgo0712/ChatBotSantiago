#Escenario 1
Feature: ChatBot santiago
  Como usuario deseo realizar agendamiento de una de cita medica presencial.
  	
		
  Scenario: Ingresar al chatbot santiago desde telegram y realizar agendamiento de una de cita medica presencial
    Given El usuario se encuentra en telegram
    When Realiza inicio de sesion en telegram por medio de codigo QR
    And Hace click en la opcion search y consulta @ColsubsidioBot e inicia conversacion desde cero con mensaje hola
    And Ingresa opcion 1.Gestiona tus citas
    And Ingresa opcion 1.CC
    And Ingresa numero de idetinficacion
    And Ingresa fecha de nacimiento
    And ingresa opcion 1.Si confirmacion de datos
    And Ingresa opcion 1.Agendar
    And Ingresa opcion 1.Medicina general
    And Ingresa opcion 1.Consulta presencial
    And Ingresa opcion 1.Agendar en zonas
    And Ingresa opcion 1.Bogota zona centro oriente
    And Ingresa opcion 1.Cm calle 26
    And Ingresa opcion 1.Zona horaria mañana
    And Ingresa opcion 1.Mes actual
    And Ingresa opcion 1.Primer dia con disponibilidad
    And Ingresa opcion 1.Primer horario con disponibilidad
    And Ingresa opcion 1.Confirmacion de cita medica
    Then Ingresa opcion 2.Salir