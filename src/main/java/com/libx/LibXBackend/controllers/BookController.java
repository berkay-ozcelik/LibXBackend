package com.libx.LibXBackend.controllers;

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
    public ResponseEntity<HashMap<Integer, String>> getBookNames(@PathVariable String bookName) {
        HashMap<Integer, String> foundBooks = new HashMap<>();

        for (int bookID = 0; bookID < 5; bookID++) {
            foundBooks.put(bookID, " Coming from rest api " + bookName + " ____ test");
        }
        return new ResponseEntity<>(foundBooks, HttpStatus.OK);
    }

}
