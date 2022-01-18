#Escenario 4
Feature: ChatBot santiago
  Como usuario deseo realizar el test de riesgo con síntomas CORONAVIRUS COVID19
  
  Scenario: Ingresar al chatbot santiago desde telegram y realizar el test de riesgo con síntomas CORONAVIRUS COVID19
    Given El usuario se encuentra en la aplicacion web de telegram
    When Realiza inicio de sesion por codigo QR
    And Hace click en consulta search y consulta @ColsubsidioBot e inicia conversacion desde cero con mensaje hola
    And Ingresa cuarta opcion Test de riesgo CORONAVIRUS COVID19
    And Ingresa primera opcion CC
    And Ingresa documento numero de cedula de ciudadania
    And Ingresa primera opcion continuar con el proceso
    And ingresa primera opcion presenta sintomas
    And ingresa primera opcion presenta sintomas de tos
    And ingresa primera opcion historial de enfermedades
    And ingresa primera opcion contacto con personas congiadas
    And Ingresa primera opcion ver centros medicos
    And Ingresa primera opcion bogota
    Then Ingresa segunda opcion 2 salir