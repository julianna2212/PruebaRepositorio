#Author: your.email@your.domain.com

Feature: Buscar en google una cadena
  Validar pagina de google buscando una cadena

  Scenario: Busqueda en google
    Given que lanzo el navegador chrome
    When abro la pagina de inicio de google
    Then Busco "Ralph" en google
