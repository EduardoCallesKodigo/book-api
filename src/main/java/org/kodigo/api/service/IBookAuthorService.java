package org.kodigo.api.service;

import org.kodigo.api.entity.BookAuthor;

import java.util.List;

public interface IBookAuthorService {
    List<BookAuthor> buscarTodos();
    void guardar(BookAuthor bookAuthor);
    void eliminar(int idBookAuthor);
}
