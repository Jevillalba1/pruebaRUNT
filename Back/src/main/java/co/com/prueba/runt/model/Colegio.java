package co.com.prueba.runt.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "colegio")
public class Colegio extends ModelPadre implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy="colegio", fetch = FetchType.LAZY)
	private List<Curso> cursos;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


}
