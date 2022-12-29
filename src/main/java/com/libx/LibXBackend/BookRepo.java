package com.libx.LibXBackend;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.*;

public class BookRepo {

    public static ArrayList<String> allBookNames = new ArrayList<>();
    public static ArrayList<Integer> allBookNumbers = new ArrayList<>();

    static {
        readAllDataAtOnce();
    }

    public static List<Object[]> getNumbersAndFullNames(String prefix) {
        ArrayList<Object[]> found = new ArrayList<>();

        int i = 0;
        for (String bookName : allBookNames) {
            bookName = bookName.toLowerCase();
            if (bookName.startsWith(prefix.toLowerCase())) {
                Object[] pair = new Object[]{allBookNumbers.get(i), allBookNames.get(i)};
                found.add(pair);
            }
            i++;
        }
        return found;
    }

    private static void readAllDataAtOnce() {
        try {
            FileReader filereader = new FileReader("pg_catalog.csv");

            CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
            List<String[]> allData = csvReader.readAll();

            for (String[] row : allData) {
                allBookNames.add(row[3]);
                allBookNumbers.add(Integer.parseInt(row[0]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

