package com.Biblioteca.org.Model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario; // FK para usuário

    @Column(nullable = false)
    private String status; //transformar em um Enum

    @CreationTimestamp
    private Date date_loan;

    @Column(nullable = false)
    private Date expected_return;

    @Column(nullable = false)
    private Date return_date;

    @OneToMany(mappedBy = "loan", cascade = CascadeType.ALL)
    private List<LoanItem> itens;
}
