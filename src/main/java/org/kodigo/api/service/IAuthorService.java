package org.kodigo.api.service;

import org.kodigo.api.entity.Author;

import java.util.List;

public interface IAuthorService {
    List<Author> buscarTodos();
    void guardar(Author author);
    void eliminar(int idAuthor);
}
