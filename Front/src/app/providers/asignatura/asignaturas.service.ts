import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

/** Models */
import { Asignatura } from 'src/models/IAsignatura';

@Injectable({
  providedIn: 'root'
})
export class AsignaturasService {

  constructor(private http: HttpClient) { }

  /**
   * obtenerAsignaturaPorIdProfesor
   */
  public obtenerAsignaturaPorIdProfesor(id: number): Promise<Asignatura> {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    return this.http.get<Asignatura>(`http://localhost:8080/api/asignaturas/profesor/${id}`, { headers })
    .toPromise();
  }
}
