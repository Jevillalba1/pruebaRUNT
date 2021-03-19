package co.com.prueba.runt.service;

import co.com.prueba.runt.dto.AsignaturaDTO;

import java.util.List;

public interface IAsignaturaService {

    public List<AsignaturaDTO> findByProfesorId(Long idProfesor);
}
