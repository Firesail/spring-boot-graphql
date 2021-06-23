package com.example.graphql.springbootgraphql.repository;

import com.example.graphql.springbootgraphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
