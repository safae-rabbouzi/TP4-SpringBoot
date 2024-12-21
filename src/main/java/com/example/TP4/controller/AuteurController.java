package com.example.TP4.controller;

import com.example.TP4.constants.Paths;
import com.example.TP4.model.Auteur;
import com.example.TP4.service.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(Paths.API_AUTEUR)
public class AuteurController {

    @Autowired
    private AuteurService auteurService;

    @GetMapping(Paths.List_ALL_AUTEURS)
    public List<Auteur> getAllAuteurs() {
        return auteurService.getAllAuteurs();
    }

    @GetMapping(Paths.AUTEUR_BY_ID)
    public Optional<Auteur> getAuteurById(@PathVariable Long id) {
        return auteurService.getAuteurById(id);
    }

    @PostMapping(Paths.ADD_AUTEUR)
    public Auteur createAuteur(@RequestBody Auteur auteur) {
        return auteurService.createAuteur(auteur);
    }

    @PutMapping(Paths.UPDATE_AUTEUR)
    public Auteur updateAuteur(@PathVariable Long id, @RequestBody Auteur auteur) {
        return auteurService.updateAuteur(id, auteur);
    }

    @DeleteMapping(Paths.DELETE_AUTEUR)
    public void deleteAuteur(@PathVariable Long id) {
        auteurService.deleteAuteur(id);
    }
}

