#Escenario 5
Feature: ChatBot santiago
  Como usuario deseo realizar el test de riesgo sin síntomas CORONAVIRUS COVID19
  
  Scenario: Ingresar al chatbot santiago desde telegram y realizar el test de riesgo sin síntomas CORONAVIRUS COVID19
    Given El usuario se encuentra en la App web de telegram
    When Realiza inicio de sesion por QR
    And Consultar en opcion @ColsubsidioBot e inicia conversacion desde cero con mensaje hola
    And Ingresa cuarta opcion 4.Test de riesgo CORONAVIRUS COVID19
    And Ingresa primera opcion 1.CC
    And Ingresa numero de documento cedula de ciudadania
    And Ingresa primera opcion continuar
    And ingresa segunda opcion No presenta sintomas
    And ingresa segunda opcion No presenta sintomas de tos
    And ingresa segunda opcion No historial de enfermedades
    And ingresa segunda opcion No contacto con personas congiadas
    Then Ingresa segunda opc salir