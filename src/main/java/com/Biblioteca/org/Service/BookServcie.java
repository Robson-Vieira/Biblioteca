package com.Biblioteca.org.Service;

import com.Biblioteca.org.Model.Book;
import com.Biblioteca.org.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServcie {

    @Autowired
    private BookRepository repository;

    public Book findBook(Long id){
        return repository.findById(id).orElseThrow(); // Lançar uma excessao personalizada posteriormente;
    }

    public List<Book> findBooks(){
        return repository.findAll();
    }

    public Book createBook(Book book){
        return repository.save(book);
    }

    public Book updateBook(Long id,Book book){
        Book oldBook = repository.findById(id).orElseThrow();// Lançar uma excessao personalizada posteriormente;
        oldBook.setCategoria(book.getCategoria());
        oldBook.setTitle(book.getTitle());
        oldBook.setDate_publication(book.getDate_publication());
        oldBook.setQuantidade(book.getQuantidade());

        return repository.save(oldBook);
    }

    public void deleteBook(Long id){
        repository.deleteById(id);
    }
}
