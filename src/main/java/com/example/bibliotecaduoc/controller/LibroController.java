package com.example.bibliotecaduoc.controller;


import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros(){
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro){
        return libroService.saveLibro(libro);
    }

    @GetMapping("{id}")
    public Libro buscarLibro(@PathVariable int id){
        return libroService.getLibroId(id);
    }

    @PutMapping("{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro){
        return libroService.updateLibro(libro);
    }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }

    @GetMapping("/total")
    public int totalLibrosV2(){
        return libroService.totalLibrosV2();
    }

    @GetMapping("/isbn/{isbn}")
    public Libro buscarLibroIsbn(@PathVariable String isbn){
        return libroService.getLibroIsbn(isbn);
    }

    @GetMapping("/year/{ano}")
    public List<Libro> listarLibrosAno(@PathVariable int ano){
        return libroService.getLibrosAno(ano);
    }

    @GetMapping("autor")
    public List<Libro> listarLibrosAutor(@RequestParam String name){
        return libroService.getLibrosAutor(name);
    }

    @GetMapping("/oldest")
    public Libro obtenerLibroMasViejo(){
        return libroService.getLibroMasViejo();
    }

    @GetMapping("/newest")
    public Libro obtenerLibroMasNuevo(){
        return libroService.getLibroMasNuevo();
    }

    @GetMapping("/totalanio")
    public List<Libro> listarLibroOrdenAno(){
        return libroService.getLibrosOrdenAno();
    }
}
