package com.example.TP4.controller;

import com.example.TP4.constants.Paths;
import com.example.TP4.model.Livre;
import com.example.TP4.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(Paths.API_LIVRE)
public class LivreController {

    @Autowired
    private LivreService livreService;

    @GetMapping(Paths.List_ALL_LIVRES)
    public List<Livre> getAllLivres() {
        return livreService.getAllLivres();
    }

    @GetMapping(Paths.LIVRE_BY_ID)
    public Optional<Livre> getLivreById(@PathVariable Long id) {
        return livreService.getLivreById(id);
    }

    @PostMapping(Paths.ADD_LIVRE)
    public Livre createLivre(@RequestBody Livre livre) {
        return livreService.createLivre(livre);
    }

    @PutMapping(Paths.UPDATE_LIVRE)
    public Livre updateLivre(@PathVariable Long id, @RequestBody Livre livre) {
        return livreService.updateLivre(id, livre);
    }

    @DeleteMapping(Paths.DELETE_LIVRE)
    public void deleteLivre(@PathVariable Long id) {
        livreService.deleteLivre(id);
    }
}

