package com.bibliotecaabc.controller;

import com.bibliotecaabc.model.Editora;
import com.bibliotecaabc.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

    @Autowired
    private EditoraService service;

    @GetMapping
    public List<Editora> listAll() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public Editora findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Editora save(@RequestBody Editora editora) {
        return service.save(editora);
    }

    @PutMapping("/{id}")
    public Editora update(@PathVariable Integer id, @RequestBody Editora editora) {
        return service.update(id, editora);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
