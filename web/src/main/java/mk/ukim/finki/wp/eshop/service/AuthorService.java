package mk.ukim.finki.wp.eshop.service;

import mk.ukim.finki.wp.eshop.model.Author;
import mk.ukim.finki.wp.eshop.model.Book;
import mk.ukim.finki.wp.eshop.model.Category;
import mk.ukim.finki.wp.eshop.model.dto.BookDto;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    List<Author> findAll();
}
