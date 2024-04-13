package com.sahi.WebApp5.bootstrap;

import com.sahi.WebApp5.Domain.Author;
import com.sahi.WebApp5.Domain.Book;
import com.sahi.WebApp5.repositories.AutorRepository;
import com.sahi.WebApp5.repositories.BookRepository;
import jakarta.persistence.Entity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class BootStrapData implements CommandLineRunner{

    private final AutorRepository autorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AutorRepository autorRepository, BookRepository bookRepository) {
        this.autorRepository = autorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author amar = new Author("Amar","Sahi");
        Book mlbm = new Book("MlBm","64758");

        amar.getBooks().add(mlbm);
        mlbm.getAuthors().add(amar);

        autorRepository.save(amar);
        bookRepository.save(mlbm);

        Author rajat = new Author("Rajat", "Sahu");
        Book ju = new Book("java Unleasehed", "28647");

        rajat.getBooks().add(ju);
        ju.getAuthors().add(rajat);

        autorRepository.save(rajat);
        bookRepository.save(ju);

        System.out.println("starting in bootstrap");

        System.out.println("Number of books : "+ bookRepository.count());




    }
}
