#language: es


Característica: comprobar funcionalidades alertas de la pagina ToolQA

    @ToolsQAAlerts
    Esquema del escenario: ingresar a la pagina de ToolQA y usar las funcionalidades de Alerts
      Dado el usuario ingresa a la opcion Alerts para usar las funciones
      Cuando el usuario use las 4 alertas de la opcion alertas
      |<textoPrueba>|
      Entonces se comprobara las funciones de alertas en la pagina ToolsQA


      Ejemplos:
        |textoPrueba|
        |PeriferiaAutomatizacion|