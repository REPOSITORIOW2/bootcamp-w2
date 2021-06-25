package com.melibootcamp;

public class WeakPassword extends Password{

    public WeakPassword(String patternStandard) {
        patternStandard = "(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
        this.setPattern(patternStandard);
    }

    public WeakPassword() {
        this.setPattern("(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}");
    }
}
