package com.nikhilgupta.spring.spring5.repositories;

import com.nikhilgupta.spring.spring5.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
