package co.com.prueba.runt.service;

import co.com.prueba.runt.dto.AsignaturaDTO;
import co.com.prueba.runt.model.Asignatura;
import co.com.prueba.runt.repository.IAsignaturaRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AsignaturaService implements IAsignaturaService {

    @Autowired
    IAsignaturaRepository iAsignaturaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<AsignaturaDTO> findByProfesorId(Long idProfesor) {
        List<Asignatura> asignaturas = iAsignaturaRepository.getByProfesorId(idProfesor);
        List<AsignaturaDTO> entityToDTO = modelMapper.map(asignaturas, new TypeToken<List<AsignaturaDTO>>(){}.getType());
        return entityToDTO;
    }
}
