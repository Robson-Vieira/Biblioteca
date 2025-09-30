package com.Biblioteca.org.Model.DTO;

import com.Biblioteca.org.Model.LoanItem;
import com.Biblioteca.org.Model.User;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

public class LoanDTO {

    private Long id;

    private User usuario; // FK para usuário

    private String status; //transformar em um Enum

    private Date date_loan;

    private Date expected_return;

    private Date return_date;

    private List<LoanItem> itens;

}
