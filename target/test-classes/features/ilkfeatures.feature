Feature: ilk feature file

  Scenario: TC01_google_iphone_arama
  Given kullanici google gider
  When kullanici iphone icin arama yapar
  Then sonuclarda iphone oldugunu dogrular


  # 1. Her feature file, Feature: kelimesi ile baslamalidir
  # 2. Her bir file da, yalniz bir Feature: kullanilabilir
  # 3. Scenario(Test Case) olusturmak için Scenario kelimesi kullanilir
  # 4. Birden fazla Scenario: kullanilabilir
  # 5. Her bir adim Given,When,and,Then,But,* kelimelerinden biriyle baslamalidir.
  # 6. Given --> Genelde ilk satirlarda, pre condition stepleri icin kullanilir
  # 7. Then --> Genelde son satirlarda, verification stepleri icin kullanilir.
  # 8. And,When --> Genelde ara adimlarda baglar olarak kullanilir
  # NOTE:   Teknik olarak istenilen kelime istenilen stepte kullanilabilir.
  #         Ama anlam karmasasi olmamasi icin bu adimlar takip edilir.



#  1.  cucumber for java yukle
#  2. gherkin yukle
#  3. intelij kapa ac
#  4. dosya .feature uzantili olmali