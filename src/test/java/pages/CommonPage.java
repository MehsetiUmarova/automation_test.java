package pages;

import org.openqa.selenium.support.PageFactory;

import static stepDefinitions.Hooks.driver;

public  abstract  class CommonPage {

    public CommonPage() {
        PageFactory.initElements(driver, this);
    }
    private FormPage formpage;

    public  FormPage getFormPage() {
        if (formpage == null) {
            formpage = new FormPage();
        }
        return formpage;
    }

}
