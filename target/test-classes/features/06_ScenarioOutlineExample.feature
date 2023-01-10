Feature: amazon search feature
  Scenario Outline: Kullanıcı aratacağı kelimeyi sonuçlarla görebilmelidir
    Given kullanıcı amazon sitesine gider
    When  kullanıcı amazonda "<kelime>" aratır
    Then  kullanıcı arama sonuçlarında "<kelime>" görmelidir
    And   kullanıcı ekran görüntüsü alır
    And   kullanıcı browser ı kapatır

    Examples:
    |kelime|
    |windows|
    |mac    |
    |linux  |