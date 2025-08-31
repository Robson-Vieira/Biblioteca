package com.Biblioteca.org.Service;

import com.Biblioteca.org.Model.Loan;
import com.Biblioteca.org.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    @Autowired
    private LoanRepository repository;

    public Loan findLoanById(Long id){
        return repository.findById(id).orElseThrow(); //lancar uma excessao
    }

    public List<Loan> findAllLoan(){
        return repository.findAll();
    }

    public Loan createLoan(Loan loan){
        return repository.save(loan);
    }

    //pensar em como deve ser feita a modifição nos alugueis


}
