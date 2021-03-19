package co.com.prueba.runt.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfesorDTO extends  PadreDto {


    private String nombre;
//    private List<AsignaturaDTO> asignaturas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public List<AsignaturaDTO> getAsignaturas() {
//        return asignaturas;
//    }
//
//    public void setAsignaturas(List<AsignaturaDTO> AsignaturaDTO) {
//        this.asignaturas = AsignaturaDTO;
//    }
}
