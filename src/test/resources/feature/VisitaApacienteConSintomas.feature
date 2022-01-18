#Escenario 6
Feature: ChatBot santiago
  Como usuario deseo realizar visita a paciente en clinica con test positivo para CORONAVIRUS COVID19
  
  Scenario: Ingresar al chatbot santiago desde telegram y realizar registro como paciente con CORONAVIRUS COVID19
    Given El usuario se encuentra en pagina web de telegram
    When Realiza inicio de sesion por medio de QR
    And Consultar en opcion search @ColsubsidioBot e inicia conversacion desde cero con mensaje hola
    And Ingresa sexta opcion 6.Test de riesgo CORONAVIRUS COVID19
    And Ingresa primera opcion 1.Clinica
    And Ingresa primera opcion cedula de ciudadania paciente
    And Ingresa numero de documento paciente
    And ingresa primera opcion cedula de ciudadania visitante
    And ingresa numero de documento visitante
    And ingresa primera opcion 1.no presenta sintomas de fiebre
    And ingresa primera opcion 1.no presenta sintomas de tos
    And ingresa primera opcion 1.contacto con personas contagiadas
    And ingresa primera opcion 1.test de prueba para covid positivo
    And ingresa primera opcion 1.has estado en cuarentena
    Then Ingresa segunda 2.opcion salir