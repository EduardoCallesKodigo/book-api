package org.kodigo.api.controller;

import org.kodigo.api.entity.Author;
import org.kodigo.api.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorController {

    @Autowired
    private IAuthorService serviceAuthor;

    @GetMapping("/authors")
    public List<Author> buscarTodos() {
        return serviceAuthor.buscarTodos();
    }

    @PostMapping("/authors")
    public Author guardar(@RequestBody Author author) {
        serviceAuthor.guardar(author);
        return author;
    }

    @PutMapping("/authors")
    public Author modificar(@RequestBody Author author) {
        serviceAuthor.guardar(author);
        return author;
    }

    @DeleteMapping("/authors/{id}")
    public String eliminar(@PathVariable("id") int idAuthor) {
        serviceAuthor.eliminar(idAuthor);
        return "Registro " + idAuthor + " Eliminado";
    }
}
