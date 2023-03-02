@bluerentalcarsKullaniciGiris
Feature:Giris_yap
  Scenario Outline:TC01_kullanici_girisi
    Given Kullanici "https://www.bluerentalcars.com/" sayfasina gider
    When Kullanici login sayfasina gider
    And Kullanici "<ad>" girer
    And "<sifre>" girer
    And login butonuna basar
    Then login islemi gerceklestigini dogrular
    Then close the application


    Examples: kullanici_verileri
    |ad                             |   sifre |
    |sam.walker@bluerentalcars.com  |c!fas_art|
    |kate.brown@bluerentalcars.com  |tad1$Fas |
    |raj.khan@bluerentalcars.com    |v7Hg_va^ |
    |pam.raymond@bluerentalcars.com |Nga^g6!  |