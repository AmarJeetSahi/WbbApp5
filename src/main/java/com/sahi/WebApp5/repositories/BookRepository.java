package com.sahi.WebApp5.repositories;

import com.sahi.WebApp5.Domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
