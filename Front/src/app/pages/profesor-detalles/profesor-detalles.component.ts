import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AsignaturasService } from 'src/app/providers/asignatura/asignaturas.service';
import * as M from 'materialize-css';

/** Model */
import { Asignatura } from 'src/models/IAsignatura';

@Component({
  selector: 'app-profesor-detalles',
  templateUrl: './profesor-detalles.component.html',
  styleUrls: ['./profesor-detalles.component.sass']
})
export class ProfesorDetallesComponent implements OnInit {

  private profesorId!: number;
  private asignaturas: Array<Asignatura> = [];
  private colegio: string = '';
  private profesor: string = ''
  public loaded: boolean = false;

  @ViewChild('collapsible') collapsible!: ElementRef;

  constructor(private asignaturasService: AsignaturasService,
              private activatedRoute: ActivatedRoute,
              private router: Router) { }
  
  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.params['profesorid'];
    if (!isNaN(id)) {
      this.profesorId = parseInt(id);
      this.ObtenerAsignaturasByProfesorId();
    } else {
      this.router.navigate(['/profesores']);
    }  
  }

  public getAsignaturas(): Array<Asignatura> {
    return this.asignaturas;
  }

  public getColegio(): String {
    return this.colegio;
  }

  public getProfesor(): String {
    return this.profesor;
  }

  private ObtenerAsignaturasByProfesorId(): void {
    this.asignaturasService.obtenerAsignaturaPorIdProfesor(this.profesorId)
    .then(asignaturas => {
      if (asignaturas) {
        this.asignaturas = this.asignaturas.concat(asignaturas);
        this.colegio = this.asignaturas[0].curso.colegio.nombre;
        this.profesor = this.asignaturas[0].profesor.nombre;
        setTimeout(() => {
          const instanceCollapsible = new M.Collapsible(this.collapsible.nativeElement, {});
        }, 100)
      }
    })
    .catch(error => {
      console.error('Lo sentimos ocurrió un error: ', error);
    }).finally(() => {
      this.loaded = true;
    });
  }

}
