package co.com.prueba.runt.controller;

import co.com.prueba.runt.dto.AsignaturaDTO;
import co.com.prueba.runt.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class AsignaturaController {

    @Autowired
    private IAsignaturaService iAsignaturaService;

    @GetMapping("/asignaturas/profesor/{id}")
    public ResponseEntity<List<AsignaturaDTO>> findByProfesorId(@PathVariable("id") Long idProfesor) {
        List<AsignaturaDTO> asignaturas = iAsignaturaService.findByProfesorId(idProfesor);

        if (!asignaturas.isEmpty()) {
            return new ResponseEntity<>(asignaturas, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }


}
