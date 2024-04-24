package org.kodigo.api.controller;

import org.kodigo.api.entity.Book;
import org.kodigo.api.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private IBookService serviceBook;

    @GetMapping("/books")
    public List<Book> buscarTodos() {
        return serviceBook.buscarTodos();
    }

    @PostMapping("/books")
    public Book guardar(@RequestBody Book book) {
        serviceBook.guardar(book);
        return book;
    }

    @PutMapping("/books")
    public Book modificar(@RequestBody Book book) {
        serviceBook.guardar(book);
        return book;
    }

    @DeleteMapping("/books/{id}")
    public String eliminar(@PathVariable("id") int idBook){
        serviceBook.eliminar(idBook);
        return "Registro " + idBook + " Eliminado";
    }
}
