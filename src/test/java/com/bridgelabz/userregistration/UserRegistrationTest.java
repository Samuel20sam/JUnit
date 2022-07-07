package com.bridgelabz.userregistration;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.firstName("Samuel");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.firstName("Elijah");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.lastName("sam");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.lastName("Dave");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.email("abc.sam@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.email("abc.kmp@bl.in");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.mobileNumber("91 9600020569");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.mobileNumber("8073132427");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.ruleFourth("Abc12345#");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
        boolean result = userRegistrationRegEx.ruleFourth("doll23#%");
        Assertions.assertFalse(result);
    }
}
