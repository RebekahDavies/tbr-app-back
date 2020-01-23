package com.davies.tbrapp.service;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class BookServiceImpl implements BookService{
    @Override
    public String getBookByIsbn(String isbn) {
        final String uri = "https://www.goodreads.com/book/isbn/" + isbn + "?key=27kBntDs4ImArFyzfs3Vg";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
        return result;
    }
}
