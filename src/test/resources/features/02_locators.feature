@locators
  Feature: Locators
    Scenario: Test case 01
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=form-authentication" adresine gider
      And kullanici adini gir
      And kullanici sifresini gir
      When submit butonuna tiklar
      And 3 saniye bekler
      Then giris yapildigini dogrula