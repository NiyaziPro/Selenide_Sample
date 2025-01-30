@dropdown
  Feature: Dropdown Test
    Scenario: Test Case 01
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=dropdown" adresine gider
      And yili dropdowndan 2022 olarak sec
      And ayi dropdowndan "May" olarak sec
      And gunu dropdowndan 27 olarak sec
      Then sayfayi acik tutar
