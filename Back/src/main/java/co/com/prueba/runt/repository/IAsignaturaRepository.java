package co.com.prueba.runt.repository;

import co.com.prueba.runt.model.Asignatura;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IAsignaturaRepository extends CrudRepository<Asignatura, Long> {

    public List<Asignatura> getByProfesorId(Long idProfesor);

}
