package com.Biblioteca.org.Controller;

import com.Biblioteca.org.Model.Book;
import com.Biblioteca.org.Service.BookServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookServcie service;

    @GetMapping("/{id}")
    public Book findBook(@PathVariable Long id){
        return service.findBook(id);
    }

    @GetMapping
    public List<Book> findBooks(){
        return service.findBooks();
    }

    @PostMapping
    public Book createBook (@RequestBody Book book){
        return service.createBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
       return service.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        service.deleteBook(id);
    }
}
