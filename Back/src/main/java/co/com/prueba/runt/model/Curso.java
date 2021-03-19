package co.com.prueba.runt.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "curso")
public class Curso extends ModelPadre implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "grado")
	private int grado;
	
	@Column(name = "salon")
	private String salon;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_colegio", nullable=false)
	@JsonBackReference
	private Colegio colegio;
	
	@OneToMany(mappedBy = "curso", fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Asignatura> asignaturas;
	
	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public void setGrado(Integer grado) {
		this.grado = grado;
	}
	
	public String getSalon() {
		return salon;
	}
	
	public void setSalon(String salon) {
		this.salon = salon;
	}
	
	public Colegio getColegio() {
		return colegio;
	}

	public void setColegio(Colegio colegio) {
		this.colegio = colegio;
	}
	
	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	
	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

		
}
