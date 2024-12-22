package com.example.TP4.service.Impl;

import com.example.TP4.model.Livre;
import com.example.TP4.repository.LivreRepository;
import com.example.TP4.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreServiceImpl implements LivreService {
    @Autowired
    private LivreRepository livreRepository;

    @Override
    public List<Livre> getAllLivres() {

        return livreRepository.findAll();
    }

    @Override
    public Optional<Livre> getLivreById(Long id) {

        return livreRepository.findById(id);
    }

    @Override
    public Livre createLivre(Livre livre) {

        return livreRepository.save(livre);
    }

    @Override
    public Livre updateLivre(Long id, Livre livre) {

        livre.setId(id);
        return livreRepository.save(livre);
    }

    @Override
    public void deleteLivre(Long id) {

        livreRepository.deleteById(id);
    }
}
