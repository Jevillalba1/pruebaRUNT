package co.com.prueba.runt.service;

import co.com.prueba.runt.dto.ProfesorDTO;
import co.com.prueba.runt.model.Profesor;
import co.com.prueba.runt.repository.IProfesorRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfesorService implements IProfesorService {

    @Autowired
    IProfesorRepository iProfesorRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProfesorDTO> findAll() {
        List<Profesor> profesors = iProfesorRepository.findAll();
        List<ProfesorDTO> entityToDto =  modelMapper.map(profesors, new TypeToken<List<ProfesorDTO>>(){}.getType());
        return entityToDto;
    }
}
