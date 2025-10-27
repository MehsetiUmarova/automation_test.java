package stepDefinitions.uiStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JS_utilities;
import utilities.ReusableMethods;
import com.github.javafaker.Faker;

import static stepDefinitions.Hooks.driver;


public class US_001_FormunDüzgünDoldurulması extends CommonPage {
    Faker faker = new Faker();

    @Given("istifadəçi ana səhifəyə daxil olur")
    public void istifadəçiAnaSəhifəyəDaxilOlur() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url1"));
        ReusableMethods.waitFor(1);
        driver.manage().deleteAllCookies();
    }

    @When("istifadəçi ana səhifəyə uğurla daxil olduğunu yoxlayır")
    public void istifadəçiAnaSəhifəyəUğurlaDaxilOlduğunuYoxlayır() {
        //PracticeForm elementinin gorunduyunu yoxla
        ReusableMethods.verifyElementDisplayed(getFormPage().practiceForm);
        ReusableMethods.waitFor(1);
    }

    @And("formu düzgün məlumatlarla doldurur")
    public void formuDüzgünMəlumatlarlaDoldurur() {
        //scroll et
        JS_utilities.scrollAndClickWithJS(getFormPage().firstName);

       //Ad xanasına klik et
        ReusableMethods.waitForClickability(getFormPage().firstName,5);

        //Ad yaz
        getFormPage().firstName.sendKeys("Mehseti");
        ReusableMethods.waitFor(1);

//       //Soyad xanasına klik et
        getFormPage().lastName.click();
        ReusableMethods.waitFor(1);
//
//        //Soyad yaz
        getFormPage().lastName.sendKeys("Umarova");
        ReusableMethods.waitFor(1);
//
//        //email xanasına random email gonder
        getFormPage().email.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(1);

//        //Cinsiyyət qadın seç
        JS_utilities.scrollAndClickWithJS(getFormPage().genderFemale);
        ReusableMethods.waitFor(1);
//
//        //random mobil nomre yaz
        getFormPage().mobile.sendKeys(faker.number().digits(10));
        ReusableMethods.waitFor(1);

        //Doğum günü seç
        JS_utilities.clickElementByJS(getFormPage().dateOfBirthInput);
        Select select = new Select(getFormPage().selectMonth);
        ReusableMethods.waitFor(1);
        select.selectByVisibleText("May");
        ReusableMethods.waitFor(1);
        Select select2 = new Select(getFormPage().selectYear);
        ReusableMethods.waitFor(1);
        select2.selectByVisibleText("2000");
        ReusableMethods.waitFor(1);
        ReusableMethods.doubleClick(getFormPage().selectDay);
        ReusableMethods.waitFor(3);
        ReusableMethods.verifyElementDisplayed(getFormPage().dateOfBirth);
        ReusableMethods.waitFor(1);
//
//        //Movzu xanasına yazı yaz
        getFormPage().Subjects.sendKeys("TEST_AUTOMATION");
        ReusableMethods.waitFor(1);
//
//        //Hobbilərin hər üçünü seç
        JS_utilities.clickElementByJS(getFormPage().hobbiesSport);
        ReusableMethods.waitFor(1);
        JS_utilities.clickElementByJS(getFormPage().hobbieReading);
        ReusableMethods.waitFor(1);
        JS_utilities.clickElementByJS(getFormPage().hobbiesMusic);
        ReusableMethods.waitFor(1);
//
//        //Şəkil upload et
        JS_utilities.scrollIntoViewJS(getFormPage().chooseFile);
        JS_utilities.mouseHoverJScript(getFormPage().uploadPicture);
        ReusableMethods.doubleClick(getFormPage().uploadPicture);
//        // Layihənin kök direktoriyasını al
        String projectPath = System.getProperty("user.dir");
//
//        // Faylın layihə içindəki nisbətən (relative) yolu
        String filePath = projectPath + "\\src\\test\\resources\\Uploads\\example.jpg";
//
//        // Sonra metodu çağır
        ReusableMethods.uploadFilePath(filePath);
        ReusableMethods.waitFor(1);
        ReusableMethods.uploadFilePath(filePath);
        ReusableMethods.waitFor(1);
//
//        //hazirki adress
        getFormPage().currentAddress.sendKeys("Baki");
        ReusableMethods.waitFor(1);     ReusableMethods.waitFor(1);
        //Ölkə seç
        ((JavascriptExecutor) driver).executeScript("document.querySelectorAll('iframe[id^=\"google_ads_iframe\"]').forEach(el => el.remove());");
        JS_utilities.scrollAndClickWithJS(getFormPage().state4);
        ReusableMethods.doubleClick(getFormPage().state4);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickElement(getFormPage().state4, ReusableMethods.ClickType.ACTIONS);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickElement(getFormPage().SelectState, ReusableMethods.ClickType.ACTIONS);
        ReusableMethods.waitFor(1);
//        //Sheher sec
        ReusableMethods.doubleClick(getFormPage().city);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickElement(getFormPage().city, ReusableMethods.ClickType.ACTIONS);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickElement(getFormPage().SelectCity, ReusableMethods.ClickType.ACTIONS);
        ReusableMethods.waitFor(1);
    }

    @And("Submit düyməsinə klikləyir")
    public void submitDüyməsinəKlikləyir() {

        getFormPage().submit.click();
        ReusableMethods.waitFor(1);

    }

    @Then("formun düzgün doğrulandığını təsdiqləyir")
    public void formunDüzgünDoğrulandığınıTəsdiqləyir() {

        ReusableMethods.verifyElementDisplayed(getFormPage().submittingForm);
        ReusableMethods.waitFor(1);
        JS_utilities.scrollIntoViewJS(getFormPage().CloseSubmittingPage);
        JS_utilities.clickElementByJS(getFormPage().CloseSubmittingPage);
        ReusableMethods.waitFor(1);

    }
}
