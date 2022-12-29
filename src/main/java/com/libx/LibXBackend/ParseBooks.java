package com.libx.LibXBackend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ParseBooks {
    private static String offlineCatalog;

    static {
    }


    public static void main(String[] args) {
        parseBooks("pg_catalog.csv");
    }

    public static void parseBooks(String path) {
        File file = new File(path);
        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException ignored) {}

        input.useDelimiter(",");
        while (input.hasNext()) {
            System.out.print(input.next() + " ");
        }


    }
}
