Feature: Checkbox and radio button

  @checkbox
  Scenario: Checkbox Test
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=checkboxes" adresine gider
    And 2 saniye bekler
    And "Checkbox 1" secili degilse sec
    And "Checkbox 2" secili degilse sec
    Then sayfayi acik tutar

  @radio
  Scenario: Radio Button Test
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=radio-buttons" adresine gider
    And "Blue" secili degilse sec
    And "Football" secili degilse sec
    Then sayfayi acik tutar