package co.com.prueba.runt.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asignatura")
public class Asignatura extends ModelPadre implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nombre")
	private String nombre;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	@JoinColumn(name="id_profesor", nullable=false)
	private Profesor profesor;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "asignatura_estudiante", 
        joinColumns = { @JoinColumn(name = "id_asignatura") },
        inverseJoinColumns = { @JoinColumn(name = "id_estudiante") }
    )
	private List<Estudiante> estudiantes;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_curso", nullable=false)
	private Curso curso;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	
	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

		
}
