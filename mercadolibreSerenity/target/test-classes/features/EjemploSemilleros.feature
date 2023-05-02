#language: es
Característica: crear cuenta en mercado libre directamente

  @CrearCuentaporLink
  Esquema del escenario: : ingresar a la pagina de mercado libre
   Dado que el cliente debe ingresar al link de crear cuenta
   Cuando el cliente autorice el uso de los datos jpablo@gmail.com
    Entonces ingresa la informacion para crear la cuenta
      |<Email>|
    Ejemplos:
      |Email|
      |jpablo@gmail.com|

  @BusquedaYCreaCuentaProducto
  Esquema del escenario: ingresar a la pagina de mercadolibre busca producto y crea cuenta
    Dado que el cliente busca Producto y elige
    Cuando el cliente elija producto
      |<Producto>|
    Entonces crea su cuenta jpablo@gmail.com


    Ejemplos:
      |Producto|
      |cerveza|