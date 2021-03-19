package co.com.prueba.runt.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CursoDTO extends  PadreDto {

    private int grado;

    private String salon;

    private ColegioDTO colegio;



    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public ColegioDTO getColegio() {
        return colegio;
    }

    public void setColegio(ColegioDTO colegio) {
        this.colegio = colegio;
    }
}
