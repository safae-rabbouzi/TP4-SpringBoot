package com.example.TP4.service;

import com.example.TP4.model.Livre;

import java.util.List;
import java.util.Optional;

public interface LivreService {
    List<Livre> getAllLivres();
    Optional<Livre> getLivreById(Long id);
    Livre createLivre(Livre livre);
    Livre updateLivre(Long id, Livre livre);
    void deleteLivre(Long id);
}
