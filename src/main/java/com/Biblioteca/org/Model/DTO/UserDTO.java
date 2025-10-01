package com.Biblioteca.org.Model.DTO;

import com.Biblioteca.org.Model.Loan;

import java.util.Date;
import java.util.List;

public class UserDTO {

    private String name;

    private String email;

    private Long cpf;

    private String password;

    private Long fone;

    private Date date_register;

    private List<Loan> loans;

}
