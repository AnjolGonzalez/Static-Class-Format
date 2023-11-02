package com.pluralsight;
import javax.naming.Name;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class NameFormatterTest {
    public static void main(String[] args) {
        format_first_last_to_last_first_test();
        format_5_string_test();
        format_fullName_test();
    }
    public static void format_first_last_to_last_first_test() {
        String firstNameTest = "Angel";
        String lastNameTest = "Gonzalez";
        String expectedFirstLast = NameFormatter.format(firstNameTest, lastNameTest);
        System.out.println(expectedFirstLast);

        String realFirstLast = NameFormatter.format("Angel", "Gonzalez");
        System.out.println(realFirstLast);
        assertEquals(expectedFirstLast, realFirstLast);
    }

    private static void assertEquals(String expectedFirstLast, String realFirstLast) {
    }

    public static void format_5_string_test() {
        String firstNameTest = "Angel";
        String lastNameTest = "Gonzalez";
        String middleNameTest = "Joan";
        String prefixTest = "Mr.";
        String suffixTest = "Jr";
        String expectedString = NameFormatter.format(prefixTest, firstNameTest, middleNameTest, lastNameTest, suffixTest);
        System.out.println(expectedString);

        String realString = NameFormatter.format("Mr.", "Angel", "Joan", "Gonzalez", "Jr");
        System.out.println(realString);
        assertEquals(expectedString, realString);
    }
    public static void format_fullName_test() {
        String fullNameTest = "Mr. Angel Gonzalez Joan, Jr";
        String expectedFullName = NameFormatter.format(fullNameTest);
        System.out.println(expectedFullName);

        String realName = NameFormatter.format("Mr. Angel Gonzalez Joan, Jr");
        System.out.println(realName);
        assertEquals (expectedFullName, realName);
    }



}