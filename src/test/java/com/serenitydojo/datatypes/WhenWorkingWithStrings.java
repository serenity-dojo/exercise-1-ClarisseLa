package com.serenitydojo.datatypes;

import org.junit.Test;

import java.util.Locale;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStrings {

    @Test
    public void convertToLowerCase() {
        String bookTitle = "The Cat In The Hat";

        String lowerCaseTitle = bookTitle.toLowerCase();

        System.out.println(lowerCaseTitle);

        // TODO: Convert the book title to lower case and assign it to the lowerCaseTitle variable

        assertThat(lowerCaseTitle, equalTo("the cat in the hat"));

    }

    @Test
    public void convertToUpperCase() {
        String bookTitle = "The Cat In The Hat";

        String upperCaseTitle = bookTitle.toUpperCase();

        System.out.println(upperCaseTitle);

        // TODO: Convert the book title to upper case and assign it to the lowerCaseTitle variable

        assertThat(upperCaseTitle, equalTo("THE CAT IN THE HAT"));
    }

    @Test
    public void trimExtraSpaces() {
        String bookTitle = "  The Cat In The Hat    ";

        String trimmedTitle = bookTitle.trim();

        System.out.println(trimmedTitle);


        // TODO: Trim the spaces before and after the title text

        assertThat(trimmedTitle, equalTo("The Cat In The Hat"));
    }

    @Test
    public void findTheLengthOfAString() {
        String bookTitle = "The Cat In The Hat";

        int length = bookTitle.length();

        System.out.println(length);



        // TODO: Find the number of characters in the string

        assertThat(length, equalTo(18));
    }

    @Test
    public void replacingAText() {
        String bookTitle = "The Cat In The Hat";

        String updatedTitle = bookTitle.replace( "The Cat In The Hat", "The Dog In The Hat");

        System.out.println(updatedTitle);

        // TODO: Replace the word "Cat" with "Dog

        assertThat(updatedTitle, equalTo("The Dog In The Hat"));
    }
}
