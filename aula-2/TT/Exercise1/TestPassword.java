package Exercise1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPassword {
    public static boolean isValid(Password pwd, String value) {
        try {
            pwd.setValue(value);
        } catch (PasswordStrengthMismatchException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Password pwd1 = new WeakPassword("^(?=.*[0-9])(?=.*[a-z]).{2,128}$");
        Password pwd2 = new MediumPassword("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{4,128}$");
        Password pwd3 = new StrongPassword("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,128}$");

        assertTrue(isValid(pwd1, "a1"));
        assertFalse(isValid(pwd1, "a"));
        assertTrue(isValid(pwd2, "aAa1"));
        assertFalse(isValid(pwd2, "aaa1"));
        assertTrue(isValid(pwd3, "aA?1bB!2"));
        assertFalse(isValid(pwd3, "aAa1aAa1"));
    }
}
