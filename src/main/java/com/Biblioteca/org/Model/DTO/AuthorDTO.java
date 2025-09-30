package com.Biblioteca.org.Model.DTO;

import com.Biblioteca.org.Model.Book;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;

import java.util.List;

public class AuthorDTO {

    private String name;

    private String nationality;

    private List<Book> livros;
}
