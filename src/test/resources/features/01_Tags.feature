Feature: Taglerin kullanımı

  @smoke
  Scenario: Smoke test senaryosu
    Given Smoke test için hazırlıklar yapıldı
    When Smoke test çalıştığında
    Then Smoke test başarılı olmalı

    @regression
    Scenario: Regression test senaryosu
      Given Regression test için hazırlıklar yapıldı
      When Regression test çalıştığında
      Then Regression test başarılı olmalı