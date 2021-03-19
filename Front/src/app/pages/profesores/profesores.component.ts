import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Profesor } from 'src/models/IProfesor';

/** providers */
import { ProfesoresService } from "../../providers/profesor/profesores.service";

@Component({
  selector: 'app-profesores',
  templateUrl: './profesores.component.html',
  styleUrls: ['./profesores.component.sass']
})
export class ProfesoresComponent implements OnInit {

  private profesores: Array<Profesor> = [];
  
  constructor(private profesorService: ProfesoresService,
              private router: Router) { }

  ngOnInit(): void {
    this.obtenerTodosProfesores();
  }

  public getProfesor() : Array<Profesor> {
    return this.profesores;
  }

  private obtenerTodosProfesores(): void {
    this.profesorService.obtenerTodos()
    .then((profesores) => {
      this.profesores = this.profesores.concat(profesores);
    })
    .catch(error => {
      console.error(error);
    });
  }

  public rutaProfesorDetalle(profesor: Profesor): string {
    return `/profesores/detalle/${profesor.id}`
  }

}
