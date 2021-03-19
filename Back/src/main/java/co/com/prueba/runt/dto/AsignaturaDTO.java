package co.com.prueba.runt.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsignaturaDTO extends  PadreDto {


    private String nombre;

    private ProfesorDTO profesor;
    private CursoDTO curso;
    private List<EstudianteDTO> estudiantes;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ProfesorDTO getProfesor() {
		return profesor;
	}

	public void setProfesor(ProfesorDTO profesor) {
		this.profesor = profesor;
	}
	
    public List<EstudianteDTO> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<EstudianteDTO> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public CursoDTO getCurso() {
        return curso;
    }

    public void setCurso(CursoDTO curso) {
        this.curso = curso;
    }
    
}
