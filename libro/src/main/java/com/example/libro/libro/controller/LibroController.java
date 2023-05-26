package com.example.libro.libro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.libro.libro.model.Libro;
import com.example.libro.libro.repository.LibroRepository;

@RestController
public class LibroController {
    
    @Autowired
    LibroRepository repository;

    @CrossOrigin
	@GetMapping(value = "/Libro", produces = MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<String> getLibros(  @PathVariable Long idGrupo  ) throws Exception{
		Libro libros = repository.findById((long) idGrupo).get();
		List<Libro>estudiantes = Libro();
		HttpHeaders responseHeaders = new HttpHeaders();
		return  new ResponseEntity<String>();
	}
    
}
