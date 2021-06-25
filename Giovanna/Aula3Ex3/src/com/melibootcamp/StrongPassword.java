package com.melibootcamp;

public class StrongPassword extends Password{
    public StrongPassword(String patternStandard) {
        patternStandard = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        this.setPattern(patternStandard);
    }

    public StrongPassword() {
        this.setPattern("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
    }
}
