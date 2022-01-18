#Escenario 3
Feature: ChatBot santiago
  Como usuario deseo confirmar agendamiento de una de cita medica presencial.
  
  Scenario: Ingresar al chatbot santiago desde telegram y realizar confirmacion de una de cita medica presencial
    Given El usuario se encuentra en app telegram
    When Realiza inicio de sesion en app telegram por medio de codigo QR
    And Hace click en search y consulta @ColsubsidioBot e inicia conversacion desde cero con mensaje hola
    And Ingresa primera opcion Gestiona tus citas
    And Ingresa primera opcion tipo de documento CC
    And Ingresa numero de cedula de ciudadania
    And Ingresa fecha de nacimiento correspondiente al usuario
    And ingresa primera opcion 1.Si, confirmacion de datos
    And Ingresa opcion 2.Confirmar
    Then Ingresa mensaje chao