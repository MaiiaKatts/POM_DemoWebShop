package com.ait.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;



public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="FirstName")
    WebElement firstName;

    @FindBy(id="LastName")
    WebElement lastName;

    @FindBy(id="Email")
    WebElement email;

    @FindBy(id="Password")
    WebElement password;

    @FindBy(id="ConfirmPassword")
    WebElement confirmPassword;

    @FindBy(id="register-button")
    WebElement registerButton;


    @Test
    public LoginPage registrationPositive(
            String fName,
            String lName,
            String eMail,
            String psw,
            String confirmPsw
    ) {
        type(firstName, fName);
        type(lastName, lName);
        type(email,eMail);
        type(password,psw);
        type(confirmPassword,confirmPsw);

        click(registerButton);

        return new LoginPage(driver);
    }

//когда поля пароля и повторного ввода пароля будут введены некорректно:
    public RegisterPage registrationNegative(
            String fName,
            String lName,
            String eMail,
            String psw,
            String confirmPsw
    ) {
        type(firstName, fName);
        type(lastName, lName);
        type(email,eMail);
        type(password,psw);
        type(confirmPassword,confirmPsw);

        click(registerButton);

        return this;
    }
}
