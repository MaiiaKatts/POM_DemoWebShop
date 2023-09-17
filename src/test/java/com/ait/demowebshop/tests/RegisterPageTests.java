package com.ait.demowebshop.tests;

import com.ait.demowebshop.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterPageTests extends TestBase {

    @Test
    public void registerPositiveTest() {
        new RegisterPage(driver)
                .registrationPositive(
                        "MAIIA",
                        "QWERTY",
                        "QWERYM@GMAIL.COM",
                        "Qwerty123$",
                        "Qwerty123$");
    }
    @Test
    public void registerNegativeTest() {
        new RegisterPage(driver)
                .registrationPositive(
                        "MAIIA",
                        "QWERTY",
                        "QWERTY@GMAIL.COM",
                        "Qwerty123$",
                        "Qwerty123");
    }
}
