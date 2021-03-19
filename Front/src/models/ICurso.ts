import { Colegio } from "./IColegio";

export interface Curso {
    id: number,
    salon: string,
    grado: number,
    colegio: Colegio
}