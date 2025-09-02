package com.Biblioteca.org.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.IdentityHashMap;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String nationality;

    @ManyToMany(mappedBy = "autores") // <-- aponta para o campo em Book
    private List<Book> livros;
}
