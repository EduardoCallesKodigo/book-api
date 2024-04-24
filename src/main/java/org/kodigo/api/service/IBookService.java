package org.kodigo.api.service;

import org.kodigo.api.entity.Book;

import java.util.List;

public interface IBookService {

    List<Book> buscarTodos();
    void guardar(Book book);
    void eliminar(int idBook);
}
