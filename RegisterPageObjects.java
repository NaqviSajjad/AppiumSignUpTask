package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageObjects {

    public RegisterPageObjects(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

        @AndroidFindBy(id = "onboarding_welcome_skip")
        public WebElement Direktstarten;

        @AndroidFindBy(id = "toolbar_profile_imageview_button")
        public WebElement ProfileImage;

        @AndroidFindBy(id = "menu_profile_image")
        public WebElement ProfileIcon;

        @AndroidFindBy(id = "switchAcceptAgbsFacebook")
        public WebElement RadioButtonCheck;

        @AndroidFindBy(id = "register")
        public WebElement WeiterMitEmail;

        @AndroidFindBy(id = "userName")
        public WebElement DeineEmailAddress;

        @AndroidFindBy(id = "password")
        public WebElement EnterPassword;

        @AndroidFindBy(id = "passwordConfirm")
        public WebElement RepeatPassword;

        @AndroidFindBy(id = "btnRegister")
        public WebElement RegisterWeiter;

        @AndroidFindBy(id = "userName")
        public WebElement EnterUsername;

        @AndroidFindBy(id = "birthdayTextDefault")
        public WebElement EnterDOB;

        @AndroidFindBy(id = "date_picker_header_year")
        public WebElement Year;

        @AndroidFindBy(id = "text1")
        public WebElement SelectedYear;

        @AndroidFindBy(id = "register_auth_email_btn")
        public WebElement registerMitEmail;

        @AndroidFindBy(xpath = "//android.widget.EditText[@text='E-Mail-Adresse']")
        public WebElement emailField;

        @AndroidFindBy(xpath = "//android.widget.EditText[@text='Passwort']")
        public WebElement passwordField;

        @AndroidFindBy(xpath = "//android.widget.EditText[@text='Passwort wiederholen']")
        public WebElement repeatPasswordField;

        @AndroidFindBy(id = "register_email_continue")
        public WebElement registerWeiter;

        @AndroidFindBy(id = "edittext_input")
        public WebElement userNameField;

        @AndroidFindBy(id = "edittext_input")
        public WebElement enterUsername;




}
