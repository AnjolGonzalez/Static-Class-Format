package com.pluralsight;

public class NameFormatter {

    public static String prefix;
    public static String firstName;
    public static String middleName;
    public static String lastName;
    public static String suffix;

    public NameFormatter(String prefix, String firstName, String middleName, String lastName, String suffix) {
        this.prefix = prefix;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }
    public static String format(String fName) {
        String[] splitName = fName.split(" ");
        return splitName[2] + ", " + splitName[0] + ", " + splitName[1] + ", " + splitName[3] + " " + splitName[4];
    }
}
