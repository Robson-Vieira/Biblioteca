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
    private Loan loan; // FK para Loan

    @ManyToOne
    @JoinColumn(name = "boook_id")
    private Book book; // FK para Book

}