package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Prestamo {
    private int idPrestamo;
    private int idLibro;
    private String runSolicitante;
    private Date fechaSolicitud;
    private Date fechaEntrega;
    private int cantidadDias;
    private int multa;
}
