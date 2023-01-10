Feature: Google arama testi

  Background: kullanıcı her senaryoda google sitesinde olacaktır
    Given kullanıcı google sayfasındadır

  Scenario: Kullanıcı samsung aradığında sanmsung görmelidir
    When kullanıcı arama kısmına samsung kelimesini aratır
    Then kullanıcı sayfada samsung geçtiğini doğrular

  Scenario: Kullanıcı cucumber aradığında cucumber görmeli
      When kullanıcı arama kısmına cucumber kelimesini aratır
      Then kullanıcı sayfada cucumber geçtiğini doğrular

  Scenario: Kullanıcı selenium aradığında selenium görmeli
    When kullanıcı arama kısmına selenium kelimesini aratır
    Then kullanıcı sayfada selenium geçtiğini doğrular