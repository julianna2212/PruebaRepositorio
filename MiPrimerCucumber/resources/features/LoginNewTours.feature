Feature: Ingresar al login de NewTours
  Validar pagina de New Tours ingresando al sistema

  Scenario: Ingresar a NewTours
    Given abro la pagina de New Tours
    When ingreso de 'usuario' y 'contrasena' 
    Then ingresar al sistema