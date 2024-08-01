package com.lista_de_tarefas.application.repositorys;

import com.lista_de_tarefas.application.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
