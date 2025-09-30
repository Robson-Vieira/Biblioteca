package com.Biblioteca.org.Model.DTO;

import com.Biblioteca.org.Model.Author;
import com.Biblioteca.org.Model.LoanItem;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class BookDTO {

    private Long id;

    private String title;

    private Date date_publication;

    private String categoria;

    private List<Author> autores;

    private List<LoanItem> item_emprestimo;
}
