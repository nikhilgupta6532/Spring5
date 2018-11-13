package com.nikhilgupta.spring.spring5.bootstrap;

import com.nikhilgupta.spring.spring5.models.Author;
import com.nikhilgupta.spring.spring5.models.Book;
import com.nikhilgupta.spring.spring5.models.Publisher;
import com.nikhilgupta.spring.spring5.repositories.AuthorRepository;
import com.nikhilgupta.spring.spring5.repositories.BookRepository;
import com.nikhilgupta.spring.spring5.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        Author eric = new Author("Nikhil","Gupta");
        Publisher tommy = new Publisher("Tom Cruise","24-7,Baker Street");
        Book node = new Book("Node_Development","1234",tommy);
        eric.getBooks().add(node);
        node.getAuthors().add(eric);

        authorRepository.save(eric);
        publisherRepository.save(tommy);
        bookRepository.save(node);

        Author rod = new Author("Oliver","Queen");
        Publisher queen = new Publisher("Thea Queen","starling city");
        Book java = new Book("Java_Development","3456",queen);
        rod.getBooks().add(java);

        authorRepository.save(rod);
        publisherRepository.save(queen);
        bookRepository.save(java);
    }
}
