Feature: google arama feature


  Scenario Outline:
    Given kullanıcı google sayfasındadır
    When  kullanıcı arama kısmına "<aranacakKelime>" kelimesini aratır
    Then  kullanıcı sayfada "<doğrulanacakKelime>" geçtiğini doğrular

    Examples:
    |aranacakKelime|doğrulanacakKelime|
    |samsung       |samsung           |
    |cucumber      |cucumber          |
    |selenium      |selenium          |
