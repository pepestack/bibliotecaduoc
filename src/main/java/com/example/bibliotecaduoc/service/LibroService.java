package com.example.bibliotecaduoc.service;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.obtenerLibros();
    }
    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id){
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "producto eliminado";
    }

    //accion del service
    public int totalLibros(){
        return libroRepository.obtenerLibros().size();
    }

    //accion del modelo
    public int totalLibrosV2(){
        return libroRepository.totalLibros();
    }

    public Libro getLibroIsbn(String isbn){
        return libroRepository.buscarPorIsbn(isbn);
    }

    public List<Libro> getLibrosAno(int anio){
        return libroRepository.obtenerLibrosAno(anio);
    }

    public List<Libro> getLibrosAutor(String autor){
        return libroRepository.obtenerLibrosAutor(autor);
    }

    public Libro getLibroMasViejo(){
        return libroRepository.buscarMasViejo();
    }

    public Libro getLibroMasNuevo(){
        return libroRepository.buscarMasNuevo();
    }

    public List<Libro> getLibrosOrdenAno(){
        return libroRepository.obtenerLibrosPorAno();
    }
}
