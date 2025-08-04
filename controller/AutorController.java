package com.bibliotecaabc.controller;

import com.bibliotecaabc.model.Autor;
import com.bibliotecaabc.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService service;

    @GetMapping
    public List<Autor> listAll() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public Autor findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Autor save(@RequestBody Autor autor) {
        return service.save(autor);
    }

    @PutMapping("/{id}")
    public Autor update(@PathVariable Integer id, @RequestBody Autor autor) {
        return service.update(id, autor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
