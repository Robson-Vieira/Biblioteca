package com.Biblioteca.org.Service;

import com.Biblioteca.org.Model.User;
import com.Biblioteca.org.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User findUserById(Long id){
        return repository.findById(id).orElseThrow(); //Implementar uma excessao
    }

    public List<User> findUsers(){
        return repository.findAll();
    }

    public User createUser(User user){
        return repository.save(user);
    }

    public User updateUser(User user){
        User u = repository.findById(user.getId()).orElseThrow();//Implementar uma excessao
        u.setName(user.getName());
        u.setCpf(user.getCpf());
        u.setFone(user.getFone());
        u.setEmail(user.getEmail());
        u.setPassword(user.getPassword());
        u.setDate_register(user.getDate_register());

        return repository.save(u);
    }

    public void deleteUser(Long id){
        repository.deleteById(id);
    }

}
