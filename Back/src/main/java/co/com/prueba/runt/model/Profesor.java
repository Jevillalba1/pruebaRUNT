package co.com.prueba.runt.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "profesor")
public class Profesor extends ModelPadre implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nombre")
	private String nombre;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = true)
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
