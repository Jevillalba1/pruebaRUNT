package co.com.prueba.runt.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "estudiante")
public class Estudiante extends ModelPadre implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nombre")
	private String nombre;
	
	@JsonIgnoreProperties({"estudiante"})
	@ManyToMany(mappedBy = "estudiantes", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Asignatura> asignaturas;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	
	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}



	
}
