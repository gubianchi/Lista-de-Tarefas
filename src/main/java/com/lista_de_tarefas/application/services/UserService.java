package com.lista_de_tarefas.application.services;

import com.lista_de_tarefas.application.models.User;
import com.lista_de_tarefas.application.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository ur;

    public void createUser(User user){
        if(ur.findByEmail(user.getEmail()).isPresent()){
            throw new IllegalArgumentException("EMAIL JA CADASTRADO");
        }
        ur.save(user);
        System.out.println("USUÁRIO CADASTRADO");
    }

    public boolean isUserCadastrado(String email, String password){
        return ur.findByEmailAndPassword(email, password).isPresent();
    }
}
