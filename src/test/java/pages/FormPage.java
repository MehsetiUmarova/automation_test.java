package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FormPage extends CommonPage {

    @FindBy(xpath = "//h1[normalize-space()='Practice Form']")
    public WebElement practiceForm;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='gender-radio-2']")
    public WebElement genderFemale;
    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElement mobile;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElement dateOfBirth;
    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    public WebElement monthDropdown;
    @FindBy(xpath = "//select[@class='react-datepicker__month-select']/option[text()='May']")
    public WebElement selectMonth;
    @FindBy(xpath = "//select[contains(@class, '_year-select')]")
    public WebElement yearDropdown;
    @FindBy(xpath = "//select[contains(@class, '_year-select')]/option[@value='1990']")
    public WebElement Selectyear;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    public WebElement Subjects;
    @FindBy(xpath = "//input[@id='hobbies-checkbox-1']")
    public WebElement hobbiesSport;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-2']")
    public WebElement hobbieReading;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-3']")
    public WebElement hobbiesMusic;
    @FindBy(xpath = "//input[@id='uploadPicture']")
    public WebElement chooseFile;

    @FindBy(css = "input#uploadPicture.form-control-file")
    public WebElement uploadPicture;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    public WebElement currentAddress;

    @FindBy(css = "#react-select-3-input")
    public WebElement state;
    @FindBy(css = "#state .css-tlfecz-indicatorContainer")
    public WebElement state1;
    @FindBy(css = "#state [id^=\"react-select\"][type=\"text\"] ~ .css-1wa3eu0-placeholder")
    public WebElement state2;
    @FindBy(css = "#state .css-1wa3eu0-placeholder")
    public WebElement state3;

    @FindBy(xpath = "//*[@id=\"state\"]//div[contains(concat(' ', normalize-space(@class), ' '), ' css-1wa3eu0-placeholder ')]")
    public WebElement state4;

    @FindBy(xpath = "//div[contains(@class,'option') and text()='NCR']")
    public WebElement SelectState;
    @FindBy(xpath = "//*[@id='city']//div[contains(@class,'css-1wa3eu0-placeholder')]")
    public WebElement city;

    @FindBy(xpath = "//div[contains(@class,'option') and text()='Delhi']")
    public WebElement SelectCity;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submit;

    @FindBy(xpath = "//div[contains(@class,'modal-title') and text()='Thanks for submitting the form']")
    public WebElement submittingForm;

    @FindBy(xpath = "//button[@id='closeLargeModal']")
    public WebElement CloseSubmittingPage;

}
