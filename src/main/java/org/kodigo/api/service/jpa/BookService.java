package org.kodigo.api.service.jpa;

import org.kodigo.api.entity.Book;
import org.kodigo.api.repository.BookRepository;
import org.kodigo.api.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private BookRepository repoBook;

    @Override
    public List<Book> buscarTodos() {
        return repoBook.findAll();
    }

    @Override
    public void guardar(Book book) {
        repoBook.save(book);
    }

    @Override
    public void eliminar(int idBook) {
        repoBook.deleteById(idBook);
    }
}
