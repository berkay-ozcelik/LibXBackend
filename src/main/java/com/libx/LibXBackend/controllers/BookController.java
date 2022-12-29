package com.libx.LibXBackend.controllers;


import org.springframework.data.util.Pair;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

@RestController
@RequestMapping("/book_api_v2")
public class BookController {
    @GetMapping("/search/{bookName}")
    public ResponseEntity<ArrayList<Object[]>> getBookNames(@PathVariable String bookName) {
        ArrayList<Object[]> foundBooks = new ArrayList<>();

        for (int bookID = 0; bookID < 5; bookID++) {
            Object[] pair = {bookID, "Test book" + 1};

            foundBooks.add(pair);
        }
        return new ResponseEntity<>(foundBooks, HttpStatus.OK);
    }

}
