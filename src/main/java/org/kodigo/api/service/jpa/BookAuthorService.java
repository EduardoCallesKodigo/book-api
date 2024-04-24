package org.kodigo.api.service.jpa;

import org.kodigo.api.entity.BookAuthor;
import org.kodigo.api.repository.BookAuthorRepository;
import org.kodigo.api.service.IBookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookAuthorService implements IBookAuthorService {

    @Autowired
    private BookAuthorRepository repoBookAuthor;

    @Override
    public List<BookAuthor> buscarTodos() {
        return repoBookAuthor.findAll();
    }

    @Override
    public void guardar(BookAuthor bookAuthor) {
        repoBookAuthor.save(bookAuthor);
    }

    @Override
    public void eliminar(int idBookAuthor) {
        repoBookAuthor.deleteById(idBookAuthor);
    }
}
