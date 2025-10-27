package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_002_FormNeqativSsenarilər {
    @Given("istifadəçi Practice Form səhifəsinə gedir")
    public void istifadəçiPracticeFormSəhifəsinəGedir() {
    }

    @And("URL: {string}")
    public void url(String arg0) {
    }

    @When("mən {string} məzmununu Email sahəsinə daxil edirəm")
    public void mənMəzmununuEmailSahəsinəDaxilEdirəm(String arg0) {
    }

    @And("digər bütün tələb olunan sahələri düzgün doldururam")
    public void digərBütünTələbOlunanSahələriDüzgünDoldururam() {
    }

    @And("{string} düyməsinə klik edirəm")
    public void düyməsinəKlikEdirəm(String arg0) {
    }

    @Then("Email sahəsi üçün qırmızı sərhəd və xəbərdarlıq göstərilməlidir")
    public void emailSahəsiÜçünQırmızıSərhədVəXəbərdarlıqGöstərilməlidir() {
    }

    @When("mən Ad sahəsini boş buraxıram")
    public void mənAdSahəsiniBoşBuraxıram() {
    }

    @Then("Ad sahəsi qırmızı sərhədlə işarələnməli və xəbərdarlıq göstərilməlidir")
    public void adSahəsiQırmızıSərhədləIşarələnməliVəXəbərdarlıqGöstərilməlidir() {
    }

    @When("mən Soyad sahəsini boş buraxıram")
    public void mənSoyadSahəsiniBoşBuraxıram() {
    }

    @Then("Soyad sahəsi qırmızı sərhədlə işarələnməli və xəbərdarlıq göstərilməlidir")
    public void soyadSahəsiQırmızıSərhədləIşarələnməliVəXəbərdarlıqGöstərilməlidir() {
    }

    @When("mən Mobil nömrə sahəsinə {string} daxil edirəm")
    public void mənMobilNömrəSahəsinəDaxilEdirəm(String arg0) {
    }

    @Then("səhv xəbərdarlıq və qırmızı sərhəd göstərilməlidir")
    public void səhvXəbərdarlıqVəQırmızıSərhədGöstərilməlidir() {
    }

    @When("mən bütün sahələri düzgün doldururam, amma cinsiyyəti seçmirəm")
    public void mənBütünSahələriDüzgünDoldururamAmmaCinsiyyətiSeçmirəm() {
    }

    @Then("cinsiyyət seçimi üçün qırmızı vurğu və xəbərdarlıq olmalıdır")
    public void cinsiyyətSeçimiÜçünQırmızıVurğuVəXəbərdarlıqOlmalıdır() {
    }

    @When("mən icazə verilməyən formatda fayl yükləyirəm \\(məs. file.txt)")
    public void mənIcazəVerilməyənFormatdaFaylYükləyirəmMəsFileTxt() {
    }

    @And("digər bütün sahələri düzgün doldururam")
    public void digərBütünSahələriDüzgünDoldururam() {
    }

    @Then("sistem xəbərdarlıq və ya bloklama göstərməlidir")
    public void sistemXəbərdarlıqVəYaBloklamaGöstərməlidir() {
    }

    @When("mən Ad sahəsinə {string} daxil edirəm")
    public void mənAdSahəsinəDaxilEdirəm(String arg0) {
    }

    @Then("sistem xüsusi simvollar, rəqəmlər, emojiləri rədd etməli və xəbərdarlıq göstərməlidir")
    public void sistemXüsusiSimvollarRəqəmlərEmojiləriRəddEtməliVəXəbərdarlıqGöstərməlidir() {
    }

    @When("mən Soyad sahəsinə {string} daxil edirəm")
    public void mənSoyadSahəsinəDaxilEdirəm(String arg0) {
    }

    @When("mən Email sahəsinə çox uzun email daxil edirəm")
    public void mənEmailSahəsinəÇoxUzunEmailDaxilEdirəm() {
    }

    @Then("sistem email uzunluğu limitini pozan giriş üçün xəbərdarlıq göstərməlidir")
    public void sistemEmailUzunluğuLimitiniPozanGirişÜçünXəbərdarlıqGöstərməlidir() {
    }

    @When("mən Doğum tarixi sahəsinə gələcək tarix daxil edirəm")
    public void mənDoğumTarixiSahəsinəGələcəkTarixDaxilEdirəm() {
    }

    @Then("sistem xəbərdarlıq etməli və form göndərilməməlidir")
    public void sistemXəbərdarlıqEtməliVəFormGöndərilməməlidir() {
    }

    @When("mən heç bir sahə doldurmuram")
    public void mənHeçBirSahəDoldurmuram() {
    }

    @Then("sistem hər sahə üçün xəbərdarlıq göstərməlidir")
    public void sistemHərSahəÜçünXəbərdarlıqGöstərməlidir() {
    }
}
