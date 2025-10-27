Feature: Ana səhifəyə giriş və formun düzgün doldurulması

  @UI @TC004
  Scenario: İstifadəçi ana səhifəyə daxil olur və formu düzgün şəkildə doldurur
    Given istifadəçi ana səhifəyə daxil olur
    When istifadəçi ana səhifəyə uğurla daxil olduğunu yoxlayır
    And formu düzgün məlumatlarla doldurur
    And Submit düyməsinə klikləyir
    Then formun düzgün doğrulandığını təsdiqləyir
