package com.example.test.repository;

import com.example.test.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BookRepository extends JpaRepository<Book,Long> {
}
