#Escenario 7
Feature: ChatBot santiago
  Como usuario deseo realizar visita a paciente en clinica con test negativo para CORONAVIRUS COVID19
  
  Scenario: Ingresar al chatbot santiago desde telegram y realizar registro como paciente sin CORONAVIRUS COVID19
    Given El usuario se encuentra en pagina de telegram
    When Realiza inicio de sesion por medio de cod QR
    And Consultar en opcion de busqueda @ColsubsidioBot e inicia conversacion desde cero con mensaje hola
    And Ingresa sexta opcion Test de riesgo CORONAVIRUS COVID19
    And Ingresa primera opcion Clinica
    And Ingresa primera opcion 1.cedula de ciudadania paciente
    And Ingresa numero de documento del paciente a visitar
    And ingresa primera opcion cedula de ciudadania del visitante
    And ingresa numero de documento del visitante
    And ingresa segunda opcion 2.no presenta sintomas de fiebre
    And ingresa segunda opcion 2.no presenta sintomas de tos
    And ingresa segunda opcion 2.contacto con personas contagiadas
    And ingresa segunda opcion 2.test de prueba para covid positivo
    And ingresa segunda opcion 2.has estado en cuarentena
    Then Ingresa segunda 2.opc salir