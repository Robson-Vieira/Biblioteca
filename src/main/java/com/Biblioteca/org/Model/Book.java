package com.Biblioteca.org.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private Date date_publication;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private int quantidadeDisponivel;

    @ManyToMany
    @JoinTable(name = "book_author",
            joinColumns = @JoinColumn(name = "livro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id"))
    private List<Author> autores;

    @OneToMany(mappedBy = "book")
    private List<LoanItem> item_emprestimo;
}
