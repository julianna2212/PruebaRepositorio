$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/features/BuscarEnGoogle.feature");
formatter.feature({
  "name": "Buscar en google una cadena",
  "description": "  Validar pagina de google buscando una cadena",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Busqueda en google",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "que lanzo el navegador chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefs.que_lanzo_el_navegador_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "abro la pagina de inicio de google",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefs.abro_la_pagina_de_inicio_de_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Busco \"Ralph\" en google",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefs.busco_en_google(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("resources/features/LoginNewTours.feature");
formatter.feature({
  "name": "Ingresar al login de NewTours",
  "description": "  Validar pagina de New Tours ingresando al sistema",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Ingresar a NewTours",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "abro la pagina de New Tours",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginNewToursStepDefs.abro_la_pagina_de_New_Tours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso de \u0027usuario\u0027 y \u0027contrasena\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "LoginNewToursStepDefs.ingreso_de_y(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresar al sistema",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginNewToursStepDefs.ingresar_al_sistema()"
});
formatter.result({
  "status": "passed"
});
});