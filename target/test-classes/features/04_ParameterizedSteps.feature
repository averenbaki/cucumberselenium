Feature: google arama feature

  Background:
    Given kullanıcı google sayfasındadır

    Scenario: cucumber search
      When kullanıcı arama kısmına "cucumber" kelimesini aratır
      Then kullanıcı sayfada "cucumber" geçtiğini doğrular