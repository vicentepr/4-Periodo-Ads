package com.bibliotecaabc.controller;

import com.bibliotecaabc.model.Livro;
import com.bibliotecaabc.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService service;

    @GetMapping
    public List<Livro> listAll() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public Livro findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Livro save(@RequestBody Livro livro) {
        return service.save(livro);
    }

    @PutMapping("/{id}")
    public Livro update(@PathVariable Integer id, @RequestBody Livro livro) {
        return service.update(id, livro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
