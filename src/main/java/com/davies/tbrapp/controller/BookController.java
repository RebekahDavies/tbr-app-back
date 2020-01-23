package com.davies.tbrapp.controller;

import com.davies.tbrapp.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    public static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    //Retrieve Book by Isbn
    @RequestMapping(value = "/{isbn}", produces = MediaType.APPLICATION_ATOM_XML_VALUE, method = RequestMethod.GET)
    public String getBookByIsbn(@PathVariable("isbn") String isbn) {
        return bookService.getBookByIsbn(isbn);
    }

}
