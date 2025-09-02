package com.Biblioteca.org.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "loan_items")
public class LoanItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "loan_id")
    private Loan emprestimo; // FK para Loan

    @ManyToOne
    @JoinColumn(name = "boook_id")
    private Book livro; // FK para Book

    private Integer quantidade;
}