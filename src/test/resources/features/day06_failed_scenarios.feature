@failed_scenario
Feature: hooks_test
  Background: googlea_git
    Given kullanici google gider

    #Bu scenario lari bilerek fail ettik
    #Raporlarda fail durumunda ekran goruntusu eklenmis olacaktir
  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" icin arama yapar
    Then sonuclarin "tea pot" icerdigini dogrula
    Then close the application


  Scenario: TC02_google_tesla_arama
    When kullanici "tesla" icin arama yapar
    Then sonuclarin "toros" icerdigini dogrula
    Then close the application