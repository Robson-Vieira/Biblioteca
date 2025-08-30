package com.Biblioteca.org.Repository;

import com.Biblioteca.org.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long > {
}
