package com.melibootcamp;

public class MediumPassword extends Password{
    public MediumPassword(String patternStandard) {
        patternStandard = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
        this.setPattern(patternStandard);
    }

    public MediumPassword() {
        this.setPattern("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}");
    }
}
