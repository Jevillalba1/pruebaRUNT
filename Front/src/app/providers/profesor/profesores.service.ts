import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

/** Models */
import { Profesor } from 'src/models/IProfesor';

@Injectable({
  providedIn: 'root'
})
export class ProfesoresService {

  constructor(private http: HttpClient) { }

  public obtenerTodos() : Promise<Profesor> {
    const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    return this.http.get<Profesor>(`http://localhost:8080/api/profesor/`, { headers })
    .toPromise();
  }
}
