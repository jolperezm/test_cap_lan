Feature: busco un vuelo y obtener la tarifa mas economica

  Background:
    Given  Como cliente ingreso a la url "https://www.latamairlines.com/cl/es"

  @test1
  Scenario: Busco un vuelo nacional
    And   escojo la ruta de inicio
    And   escojo la ruta de retorno
    And   escojo fecha ida
    And   escojo fecha retorno
    And   escojo el asiento
    And   ingresar pasajero
    Then    obtengo la ruta mas barata