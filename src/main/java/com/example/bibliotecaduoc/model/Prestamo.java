package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Prestamo {
    private int idPrestamo;
    private int idLibro;
    private String runSolicitante;
    private LocalDate fechaSolicitud;
    private LocalDate fechaEntrega;
    private int cantidadDias;
    private int multa;
}
