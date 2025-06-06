package com.game;

public class Colors {

    // Reset
    public static final String RESET        = "\u001B[0m";
    // Regular Colors
    public static final String RED          = "\u001B[31m";
    public static final String GREEN        = "\u001B[32m";
    public static final String YELLOW       = "\u001B[33m";
    public static final String BLUE         = "\u001B[34m";
    public static final String PURPLE       = "\u001B[35m";
    public static final String CYAN         = "\u001B[36m";
    public static final String GREY         = "\u001B[37m";
    // Bright Colors
    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_WHITE = "\u001B[97m"; //
    // Text Styles
    public static final String BOLD         = "\u001B[1m";
    public static final String UNDERLINE    = "\u001B[4m";
    public static final String REVERSED     = "\u001B[7m";


    // Color & Style Test Method
    public void colorTest() {
        // Color Test
        System.out.println(RED          + "Red Text"          + RESET);
        System.out.println(GREEN        + "Green Text"        + RESET);
        System.out.println(YELLOW       + "Yellow Text"       + RESET);
        System.out.println(BLUE         + "Blue Text"         + RESET);
        System.out.println(PURPLE       + "Purple Text"       + RESET);
        System.out.println(CYAN         + "Cyan Text"         + RESET);
        System.out.println(GREY         + "Grey Text"         + RESET);
        System.out.println(BRIGHT_WHITE + "Bright White Text" + RESET);
        System.out.println(BRIGHT_BLACK + "Bright Black?"     + RESET);
        // Text Style Test
        System.out.println(BOLD         + "Bold Text"         + RESET);
        System.out.println(UNDERLINE    + "Underlined Text"   + RESET);
        System.out.println(REVERSED + "Reversed Text"         + RESET);
    }
}