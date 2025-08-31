package com.Biblioteca.org.Service;

import com.Biblioteca.org.Model.Author;
import com.Biblioteca.org.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository repository;

    public Author findAuthorById(Long id){
        return repository.findById(id).orElseThrow(); //Implementar Excessao
    }

    public List<Author> findAllAuthor(){
        return repository.findAll();
    }

    public Author createAuthor(Author author){
        return repository.save(author);
    }

    public Author updateAuthor(Author author){
        Author au = repository.findById(author.getId()).orElseThrow(); //Implementar Excessao
        au.setName(author.getName());
        au.setNationality(author.getNationality());
        return repository.save(au);
    }

    public void deleteAuthor(Long id){
        repository.deleteById(id);
    }

}
