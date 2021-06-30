package dev.feldmann.bootcamp.modulo6.Aula1.services.romanNumbersConverter;

public enum RomanCharacter {

    M(1000),
    CM(900),
    D(500),
    CD(400),
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
    IX(9),
    V(5),
    IV(4),
    I(1),
    ;


    private int value;

    RomanCharacter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static RomanCharacter getTop(int value) {
        for (var romanCharacter : RomanCharacter.values()) {
            if (romanCharacter.value <= value) {
                return romanCharacter;
            }
        }
        return null;

    }
}
