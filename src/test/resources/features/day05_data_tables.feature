@data_tables
Feature: data_tables
  Scenario: TC01_musteri_giris_testi
    Given kullanici "https://www.bluerentalcars.com/login" gider
    When kullanici emaili ve sifresini girer
    #  |   |  -> datatable olusturmak icin kullanilir. DataTables Scnario Outline ile de kullanilabilir.


      | email                         | sifre     |
      | sam.walker@bluerentalcars.com | c!fas_art |
    Then close the application

