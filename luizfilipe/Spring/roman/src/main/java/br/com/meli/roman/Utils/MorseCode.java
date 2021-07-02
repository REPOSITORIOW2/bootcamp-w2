package br.com.meli.roman.Utils;

public enum MorseCode {
    A(".-"),
    B("-..."),
    C("-.-."),
    D("-.."),
    E("."),
    F("..-."),
    G("--."),
    H("...."),
    I(".."),
    J(".---"),
    K("-.-"),
    L(".-.."),
    M("--"),
    N("-."),
    O("---"),
    P(".--."),
    Q("--.-"),
    R(".-."),
    S("..."),
    T("-"),
    U("..-"),
    V("...-"),
    W(".--"),
    X("-..-"),
    Y("-.--"),
    Z("--.."),
    ZERO('0', "-----"),
    ONE('1', ".----"),
    TWO('2', "..---"),
    THREE('3', "...--"),
    FOUR('4', "....-"),
    FIVE('5', "....."),
    SIX('6', "-...."),
    SEVEN('7', "--..."),
    EIGHT('8', "---.."),
    NINE('9', "----.");

    private char character;
    private String code;

    MorseCode(char character, String code) {
        this.character = character;
        this.code = code;
    }

    MorseCode(String code) {
        this.character = this.name().charAt(0);
        this.code = code;
    }

    public static char decode(String s) {
        for (MorseCode morseCode : MorseCode.values()) {
            if (morseCode.code.equals(s)) {

                return morseCode.character;
            }
        }
        throw new IllegalArgumentException(s
                + " is not a valid Morse Code");
    }

    public static String encode(char c) {
        for (MorseCode morseCode : MorseCode.values()) {
            if (morseCode.character == Character.toUpperCase(c)) {

                return morseCode.code;
            }
        }
        throw new IllegalArgumentException(c
                + " cannot be found");
    }
}
