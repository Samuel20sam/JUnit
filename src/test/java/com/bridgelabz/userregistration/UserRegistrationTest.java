package com.bridgelabz.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.firstNameValidate("Samuel");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.firstNameValidate("Ahmed");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.lastNameValidate("Elijah");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.lastNameValidate("Mustafa");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.emailValidate("abc.sam@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.emailValidate("abc.sam@bl.in");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.phoneNumberValidate("91 9600020569");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.phoneNumberValidate("8025647598");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.passwordValidate("Rawath23#%");
        Assertions.assertFalse(result);
    }
}