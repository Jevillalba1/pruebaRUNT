package co.com.prueba.runt.controller;

import co.com.prueba.runt.dto.ProfesorDTO;
import co.com.prueba.runt.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class ProfesorController {
	
	@Autowired
	private IProfesorService iProfesorService;

	@GetMapping("/profesor")
	public ResponseEntity<List<ProfesorDTO>> findAll() {
		List<ProfesorDTO> profesores = iProfesorService.findAll();

		if (!profesores.isEmpty()) {
			return new ResponseEntity<>(profesores, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
        
    }




}
