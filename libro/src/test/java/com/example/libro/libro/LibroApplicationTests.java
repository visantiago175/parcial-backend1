package com.example.libro.libro;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.libro.libro.model.Libro;
import com.example.libro.libro.repository.LibroRepository;

@SpringBootTest
class LibroApplicationTests {

	@Autowired
    private LibroRepository repository;

	@Test
	void contextLoads() {
		try{
            Iterator<Libro> libros = repository.findAll().iterator();
            int cantidad = 0;
            while(libros.hasNext() ) {
                libros.next();
                cantidad ++;
            }
            Libro libro = new Libro("don quijote","E26B", "Miguel de cervantes", 50000, "libreria nacional");
            repository.save(libro);

            libro = new Libro("dragon ball","330", "Akira Toriyama", 70000,"biblioteca JMSD");
            repository.save(libro);

            libro = new Libro("sueñan los androides con ovejas electricas?", "G10", "Philip K. Dick ", 40000, "mi casa");
            repository.save(libro);

            libro = (Libro) repository.findAll().iterator();
            int nuevaCantidad = 0;
            while(libros.hasNext() ) {
                libros.next();
                nuevaCantidad ++;
            }
            assertTrue(cantidad + 3 == nuevaCantidad, "Aumento en la cantidad debida" );
        }
        catch (Exception e){
            e.printStackTrace();
            assertTrue( false, "Error en la aplicación" );
        }
	}

}
