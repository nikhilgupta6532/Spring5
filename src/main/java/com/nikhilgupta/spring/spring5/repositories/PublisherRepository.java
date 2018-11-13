package com.nikhilgupta.spring.spring5.repositories;

import com.nikhilgupta.spring.spring5.models.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
