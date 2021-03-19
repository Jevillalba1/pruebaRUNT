package co.com.prueba.runt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.prueba.runt.model.Profesor;

public interface IProfesorRepository extends CrudRepository<Profesor, Long> {

	public List<Profesor> findAll();

}
