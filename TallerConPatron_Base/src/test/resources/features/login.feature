#Autor: Juan Medina
  @HistoriaDeUsuario
  Feature: Verify form
    Me as an user want to verify the register form
  Scenario Outline:
    Given I enter with my credentials
    |User|Password|
    |<User>|<Password>|
    When I proceed with the authentication
    And go to the main view of the page
    And enter to the form submenu called form validations
    And check the title of the form on the screen
    And fill all the file
      |User|Password|Required|Select|MultipleSelect|Url|Email|Password2|ConfirmPassword|MinField|MaxField|Number|ip|date|dateEarlier|
      |<User>|<Password>|<Required>|<Select>|<MultipleSelect>|<Url>|<Email>|<Password2>|<ConfirmPassword>|<MinField>|<MaxField>|<Number>|<ip>|<date>|<dateEarlier>|
    And click the validate button
    Then the fields will go back to their initial state

    Examples:
    |User|Password|Required|Select|MultipleSelect|Url|Email|Password2|ConfirmPassword|MinField|MaxField|Number|ip|date|dateEarlier|
    |admin|admin|prueba |option2|option3 |http://dfsdfd.com|a@q.com|123|123|123456||-38|192.168.3.2|2022-12-16|2012/08/13|