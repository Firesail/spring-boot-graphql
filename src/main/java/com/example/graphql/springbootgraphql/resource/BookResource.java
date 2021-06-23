package com.example.graphql.springbootgraphql.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/books")
public class BookResource {

    @PostMapping
    public void getAllBooks(@RequestBody String query) {

    }

}
