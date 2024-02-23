#Author: jhonatan.paiva@e2etreinamentos.com.br

@regressivos
Feature: Buscar cep no correio
  Como usuario do correio
  Quero informar um cep na busca
  Para validar os dados de retorno

  @positivo
  Scenario: Realizar a busca por cep
    When enviar os dados para busca
    Then validar os dados retornados
 
