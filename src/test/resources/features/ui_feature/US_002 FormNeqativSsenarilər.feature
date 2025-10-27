@UI @TC002
Feature: Practice Form səhifəsində mənfi senarilər

  Məqsəd: Form sahələrində səhv və boş girişlər üçün validasiya yoxlanışı

  Background:
    Given istifadəçi Practice Form səhifəsinə gedir
    And URL: "https://demoqa.com/automation-practice-form"

  @NegativeTC_002
  Scenario Outline: Email sahəsi boş və ya səhv formatda olduqda xəbərdarlıq göstərilməsi
    When mən "<EmailInput>" məzmununu Email sahəsinə daxil edirəm
    And digər bütün tələb olunan sahələri düzgün doldururam
    And "Submit" düyməsinə klik edirəm
    Then Email sahəsi üçün qırmızı sərhəd və xəbərdarlıq göstərilməlidir

    Examples:
      | EmailInput         |
      | ""                 |
      | "aylin@@mail"       |
      | "aylin.mail.com"    |

  @NegativeTC_003
  Scenario: Ad sahəsi boş buraxıldıqda xəbərdarlıq göstərilməsi
    When mən Ad sahəsini boş buraxıram
    And digər bütün tələb olunan sahələri düzgün doldururam
    And "Submit" düyməsinə klik edirəm
    Then Ad sahəsi qırmızı sərhədlə işarələnməli və xəbərdarlıq göstərilməlidir

  @NegativeTC_004
  Scenario: Soyad sahəsi boş buraxıldıqda xəbərdarlıq göstərilməsi
    When mən Soyad sahəsini boş buraxıram
    And digər bütün tələb olunan sahələri düzgün doldururam
    And "Submit" düyməsinə klik edirəm
    Then Soyad sahəsi qırmızı sərhədlə işarələnməli və xəbərdarlıq göstərilməlidir

  @NegativeTC_005
  Scenario Outline: Mobil nömrə uzunluğunun yoxlanması
    When mən Mobil nömrə sahəsinə "<MobileInput>" daxil edirəm
    And digər bütün tələb olunan sahələri düzgün doldururam
    And "Submit" düyməsinə klik edirəm
    Then səhv xəbərdarlıq və qırmızı sərhəd göstərilməlidir

    Examples:
      | MobileInput    |
      | "12345"         |
      | "501234567890"  |

  @NegativeTC_006
  Scenario: Cinsiyyət seçilmədikdə xəbərdarlıq
    When mən bütün sahələri düzgün doldururam, amma cinsiyyəti seçmirəm
    And "Submit" düyməsinə klik edirəm
    Then cinsiyyət seçimi üçün qırmızı vurğu və xəbərdarlıq olmalıdır

  @NegativeTC_007
  Scenario: Şəkil yükləmə formatının yoxlanması
    When mən icazə verilməyən formatda fayl yükləyirəm (məs. file.txt)
    And digər bütün sahələri düzgün doldururam
    And "Submit" düyməsinə klik edirəm
    Then sistem xəbərdarlıq və ya bloklama göstərməlidir

  @NegativeTC_008
  Scenario Outline: Ad sahəsinə xüsusi simvollar daxil edilmədiyi halda xəbərdarlıq
    When mən Ad sahəsinə "<FirstNameInput>" daxil edirəm
    And digər bütün tələb olunan sahələri düzgün doldururam
    And "Submit" düyməsinə klik edirəm
    Then sistem xüsusi simvollar, rəqəmlər, emojiləri rədd etməli və xəbərdarlıq göstərməlidir

    Examples:
      | FirstNameInput |
      | "Ali123"         |
      | "@#$%&*()"       |
      | "😊🔥Test"        |

  @NegativeTC_009
  Scenario Outline: Soyad sahəsinə xüsusi simvollar daxil edilmədiyi halda xəbərdarlıq
    When mən Soyad sahəsinə "<LastNameInput>" daxil edirəm
    And digər bütün tələb olunan sahələri düzgün doldururam
    And "Submit" düyməsinə klik edirəm
    Then sistem xüsusi simvollar, rəqəmlər, emojiləri rədd etməli və xəbərdarlıq göstərməlidir

    Examples:
      | LastNameInput |
      | "Ali123"        |
      | "@#$%&*()"      |
      | "😊🔥Test"       |

  @NegativeTC_010
  Scenario: Email sahəsinin uzunluğu limitlərinin yoxlanması
    When mən Email sahəsinə çox uzun email daxil edirəm
      # (məsələn local-part > 64 simvol və ya ümumi uzunlu > 254)
    And digər bütün tələb olunan sahələri düzgün doldururam
    And "Submit" düyməsinə klik edirəm
    Then sistem email uzunluğu limitini pozan giriş üçün xəbərdarlıq göstərməlidir

  @NegativeTC_011
  Scenario: Doğum tarixinin gələcək tarix seçildikdə xəbərdarlıq
    When mən Doğum tarixi sahəsinə gələcək tarix daxil edirəm
    And digər bütün tələb olunan sahələri düzgün doldururam
    And "Submit" düyməsinə klik edirəm
    Then sistem xəbərdarlıq etməli və form göndərilməməlidir

  @NegativeTC_012
  Scenario: Heç bir sahə doldurulmadan form göndərilməsi
    When mən heç bir sahə doldurmuram
    And "Submit" düyməsinə klik edirəm
    Then sistem hər sahə üçün xəbərdarlıq göstərməlidir
