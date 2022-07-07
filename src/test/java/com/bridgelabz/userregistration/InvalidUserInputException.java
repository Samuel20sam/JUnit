package com.bridgelabz.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvalidUserInputException extends Exception
{
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        try {
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.firstName("Samuel");
            Assertions.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.firstName("Elijah");
            Assertions.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.lastName("sam");
            Assertions.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.lastName("Dave");
            Assertions.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.email("abc.sam@bl.co.in");
            Assertions.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.email("abc.kmp@bl.in");
            Assertions.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.mobileNumber("91 9600020569");
            Assertions.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.mobileNumber("8073132427");
            Assertions.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.ruleFourth("Abc12345#");
            Assertions.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.ruleFourth("doll23#%");
            Assertions.assertTrue(result);
        } catch (Exception e) {
        }
    }
}
