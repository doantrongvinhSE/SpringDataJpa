package com.doantrongvinhse.DataJpa.service;


import com.doantrongvinhse.DataJpa.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAllAuthors();
    Author getAuthorById(Long id);
    Author save(Author author);
    void deleteAuthor(Long id);
}
