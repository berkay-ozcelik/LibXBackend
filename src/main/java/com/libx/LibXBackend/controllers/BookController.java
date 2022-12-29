package com.libx.LibXBackend.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.libx.LibXBackend.BookRepo;

@RestController
@RequestMapping("/book_api_v2")
public class BookController {
    @GetMapping("/search/{bookName}")
    public ResponseEntity<List<Object[]>> getBookNames(@PathVariable String bookName) {
        List<Object[]> foundBooks = BookRepo.getNumbersAndFullNames(bookName);
        return new ResponseEntity<>(foundBooks, HttpStatus.OK);
    }

}
