package org.kodigo.api.controller;

import org.kodigo.api.entity.BookAuthor;
import org.kodigo.api.service.IBookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookAuthorController {

    @Autowired
    private IBookAuthorService serviceBookAuthor;

    @GetMapping("/book_authors")
    public List<BookAuthor> buscarTodos() {
        return serviceBookAuthor.buscarTodos();
    }

    @PostMapping("book_authors")
    public BookAuthor guardar(@RequestBody BookAuthor bookAuthor){
        serviceBookAuthor.guardar(bookAuthor);
        return bookAuthor;
    }

    @PutMapping("book_authors")
    public BookAuthor modificar(@RequestBody BookAuthor bookAuthor){
        serviceBookAuthor.guardar(bookAuthor);
        return bookAuthor;
    }

    @DeleteMapping("/book_authors/{id}")
    public String eliminar(@PathVariable("id") int idBookAuthor){
        serviceBookAuthor.eliminar(idBookAuthor);
        return "Registro " + idBookAuthor + " Eliminado";
    }
}
