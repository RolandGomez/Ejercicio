#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Formulario popup Validation 
el usuario debe poder ingresar al formulario los datos requeridos
cada campo del formulario realiza validaciones de obligatoriedad,
longitud y formato, el sistema debe presentar las validaciones respectivas
para cada campo a traves un globo informativo

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario popu validation, no se presenta ningun mensaje de validacion.
    Given Auntentico en colorlib con usuario "demo" y clave "demo"
    And ingreso a la funcionalidad forms validation
    When diligencio formulario popup validation
    Then verifico ingreso exitoso

  @CasoAlterno
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
