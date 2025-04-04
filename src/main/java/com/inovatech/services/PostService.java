package com.inovatech.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inovatech.domain.Post;
import com.inovatech.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository repository; // Supondo que você usa Spring Data JPA

    // Método para buscar todos os posts
    public List<Post> findAll() {
        return repository.findAll(); // Spring Data JPA já fornece este método
    }

    // Métodos existentes (findById, findByTitle, fullSearch...)
    public Post findById(String id) {
        // Implementação existente
    }

    public List<Post> findByTitle(String text) {
        // Implementação existente
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
        // Implementação existente
    }
}