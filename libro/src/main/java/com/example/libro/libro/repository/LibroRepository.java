package com.example.libro.libro.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.libro.libro.model.Libro;

public interface LibroRepository extends CrudRepository<Libro, Long>{
    
}
