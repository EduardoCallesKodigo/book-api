package org.kodigo.api.service.jpa;

import org.kodigo.api.entity.Author;
import org.kodigo.api.repository.AuthorRepository;
import org.kodigo.api.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthorService {

    @Autowired
    private AuthorRepository repoAuthor;
    @Override
    public List<Author> buscarTodos() {
        return repoAuthor.findAll();
    }

    @Override
    public void guardar(Author author) {
        repoAuthor.save(author);
    }

    @Override
    public void eliminar(int idAuthor) {
        repoAuthor.deleteById(idAuthor);
    }
}
