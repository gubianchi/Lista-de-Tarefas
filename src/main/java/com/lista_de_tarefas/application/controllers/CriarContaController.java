package com.lista_de_tarefas.application.controllers;

import com.lista_de_tarefas.application.models.User;
import com.lista_de_tarefas.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CriarContaController {

    @Autowired
    private UserService userService;


    @GetMapping("/cadastro")
    public ModelAndView paginaCadastro(){
        return new ModelAndView("formCadastro");
    }


    @PostMapping("/cadastro")
    public ModelAndView cadastrarUser(String email, String username, String password) {
        boolean flag = false;
        try{
            userService.createUser(new User(username, email, password));
        }catch(IllegalArgumentException err){
            System.out.println("CREDENCIAIS INVÁLIDAS");
            flag = true;
        }
        finally {
            if (flag) return new ModelAndView("formCadastro");

            System.out.println("DADOS CADASTRADOS");
        }
        return new ModelAndView("formLogin");
    }
}
