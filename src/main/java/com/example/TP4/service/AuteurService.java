package com.example.TP4.service;

import com.example.TP4.model.Auteur;

import java.util.List;
import java.util.Optional;

public interface AuteurService {
    List<Auteur> getAllAuteurs();
    Optional<Auteur> getAuteurById(Long id);
    Auteur createAuteur(Auteur auteur);
    Auteur updateAuteur(Long id, Auteur auteur);
    void deleteAuteur(Long id);
}
