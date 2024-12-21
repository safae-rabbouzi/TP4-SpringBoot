package com.example.TP4.service.Impl;

import com.example.TP4.model.Auteur;
import com.example.TP4.repository.AuteurRepository;
import com.example.TP4.service.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuteurServiceImpl implements AuteurService {
    @Autowired
    private AuteurRepository auteurRepository;

    @Override
    public List<Auteur> getAllAuteurs() {
        return auteurRepository.findAll();
    }

    @Override
    public Optional<Auteur> getAuteurById(Long id) {
        return auteurRepository.findById(id);
    }

    @Override
    public Auteur createAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    @Override
    public Auteur updateAuteur(Long id, Auteur auteur) {
        auteur.setId(id);
        return auteurRepository.save(auteur);
    }

    @Override
    public void deleteAuteur(Long id) {
        auteurRepository.deleteById(id);
    }
}
