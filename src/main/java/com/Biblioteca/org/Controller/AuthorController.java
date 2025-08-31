package com.Biblioteca.org.Controller;

import com.Biblioteca.org.Model.Author;
import com.Biblioteca.org.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @GetMapping("/{id}")
    public Author findAuthorById(@PathVariable Long id) {
        return service.findAuthorById(id);
    }

    @GetMapping
    public List<Author> findAllAuthors() {
        return service.findAllAuthor();
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return service.createAuthor(author);
    }

    @PutMapping
    public Author updateAuthor(@RequestBody Author author) {
        return service.updateAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        service.deleteAuthor(id);
    }
}