package com.doantrongvinhse.DataJpa.controller;

import com.doantrongvinhse.DataJpa.model.Author;
import com.doantrongvinhse.DataJpa.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public ResponseEntity<?> getAllAuthors() {
        return ResponseEntity.ok(authorService.getAllAuthors());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAuthorById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(authorService.getAuthorById(id));
    }

    @PostMapping
    public ResponseEntity<?> createAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(authorService.save(author));
    }

    @PutMapping
    public ResponseEntity<?> updateAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(authorService.save(author));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAuthor(@PathVariable("id") Long id) {
        authorService.deleteAuthor(id);
        return ResponseEntity.ok("Author deleted successfully");
    }

}
