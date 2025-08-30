package com.Biblioteca.org.Controller;

import com.Biblioteca.org.Model.Loan;
import com.Biblioteca.org.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    public LoanService service;

    @GetMapping("/{id}")
    public Loan findLoanById(@PathVariable Long id){
        return service.findLoanById(id);
    }

    @GetMapping
    public List<Loan> findAllLoan(){
        return service.findAllLoan();
    }

    @PostMapping
    public Loan createLoan(@RequestBody Loan loan){
        return service.createLoan(loan);
    }
}
