import { Curso } from "./ICurso";
import { Estudiante } from "./IEstudiante";
import { Profesor } from "./IProfesor";

export interface Asignatura {
    id: number,
    nombre: string,
    profesor: Profesor,
    estudiantes: Array<Estudiante>,
    curso: Curso
}