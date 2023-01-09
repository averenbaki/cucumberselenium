Feature: Google search test
  Scenario: Google da bir kelime arandığında ilgili kelimeyi barındıran sonuçlar görüntülenmelidir
    Given kullanıcı google sayfasındadır
    When kullanıcı arama kısmına samsung kelimesini aratır
    Then kullanıcı sayfada samsung geçtiğini doğrular