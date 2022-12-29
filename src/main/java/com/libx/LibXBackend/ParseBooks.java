package com.libx.LibXBackend;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ParseBooks {

    public static void main(String[] args) {
        //parseBooks();
    }
    public static void parseBooks(String bookList) {
        // Use a regular expression to extract the book id, name, and author
        // from each line in the input string
        Pattern p = Pattern.compile("^(\\d+)\\s*(.*?),\\s*by\\s*(.*?)\\s*$");

        // Split the input string into individual lines
        String[] lines = bookList.split("\n");

        // Iterate through each line and parse the book id, name, and author
        for (String line : lines) {
            Matcher m = p.matcher(line);
            if (m.find()) {
                String bookId = m.group(1);
                String bookName = m.group(2);
                String bookAuthor = m.group(3);
                System.out.println("Book id: " + bookId + ", name: " + bookName + ", author: " + bookAuthor);
            }
        }
    }
}
