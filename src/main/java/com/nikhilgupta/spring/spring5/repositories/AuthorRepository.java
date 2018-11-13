package com.nikhilgupta.spring.spring5.repositories;

import com.nikhilgupta.spring.spring5.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author , Long> {
}
