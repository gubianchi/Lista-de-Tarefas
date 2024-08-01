package com.lista_de_tarefas.application.services;

import com.lista_de_tarefas.application.repositorys.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    @Autowired
    private NoteRepository nr;
}
