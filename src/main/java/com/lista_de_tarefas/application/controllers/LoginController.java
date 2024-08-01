package com.lista_de_tarefas.application.controllers;

import com.lista_de_tarefas.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/userLogin")
    public ModelAndView telaLogin(){
        return new ModelAndView("formLogin");
    }

    @PostMapping("/logar")
    public ModelAndView logar(String email, String password){
        if(userService.isUserCadastrado(email, password)){
            return new ModelAndView("notes");
        }
        return new ModelAndView("formLogin");

    }
}
