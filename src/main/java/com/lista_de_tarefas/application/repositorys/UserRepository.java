package com.lista_de_tarefas.application.repositorys;

import com.lista_de_tarefas.application.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);

    /*
    @Query("SELECT u FROM User u WHERE u.email = email AND u.password = password")
    Optional<User> findByEmailAndPassword(String email, String password);

     */
}
