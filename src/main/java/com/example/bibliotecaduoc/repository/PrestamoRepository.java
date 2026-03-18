package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Prestamo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PrestamoRepository {

    private List<Prestamo> listaPrestamos = new ArrayList<>();

    public List<Prestamo> obtenerPrestamos() { return listaPrestamos; }

    public Prestamo guardar(Prestamo pr){
        listaPrestamos.add(pr);
        return pr;
    }

    public Prestamo buscarPorId(int id){
        for (Prestamo pr : listaPrestamos){
            if(pr.getIdPrestamo()==id){
                return pr;
            }
        }
        return null;
    }

    public Prestamo actualizar(Prestamo lib){
        int id = 0;
        int idPosicion = 0;

        for(int i = 0; i < listaPrestamos.size(); i++){
            if(listaPrestamos.get(i).getIdPrestamo() == lib.getIdPrestamo()){
                id = lib.getIdPrestamo();
                idPosicion = i;
            }
        }

        Prestamo Prestamo1 = new Prestamo();
        Prestamo1.setIdPrestamo(id);
        Prestamo1.setIdLibro(lib.getIdLibro());
        Prestamo1.setRunSolicitante(lib.getRunSolicitante());
        Prestamo1.setFechaSolicitud(lib.getFechaSolicitud());
        Prestamo1.setFechaEntrega(lib.getFechaEntrega());
        Prestamo1.setCantidadDias(lib.getCantidadDias());
        Prestamo1.setMulta(lib.getMulta());

        listaPrestamos.set(idPosicion,Prestamo1);
        return Prestamo1;
    }

    public void eliminar(int id){
        listaPrestamos.removeIf(x -> x.getIdPrestamo() == id);
    }

}
