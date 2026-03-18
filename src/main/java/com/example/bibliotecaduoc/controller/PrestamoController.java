package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @GetMapping
    public List<Prestamo> listarPrestamos(){
        return prestamoService.getPrestamos();
    }

    @PostMapping
    public Prestamo agregarPrestamo(@RequestBody Prestamo pr){
        return prestamoService.savePrestamo(pr);
    }

    @GetMapping("{id}")
    public Prestamo buscarPrestamo(@PathVariable int id){
        return prestamoService.getPrestamoId(id);
    }
    @GetMapping("{id}")
    public Prestamo actualizarPrestamo(@PathVariable int id, @RequestBody Prestamo pr){
        return prestamoService.updatePrestamo(pr);
    }
    @DeleteMapping("{id}")
    public String eliminarPrestamo(@PathVariable int id){
        return prestamoService.deletePrestamo(id);
    }
}
