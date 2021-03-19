/* Poblar tabla colegio */

INSERT INTO colegio (nombre) VALUES ('El colegio del Olimpo');

/* Poblamos tabla cursos */

INSERT INTO curso (grado, salon, id_colegio) VALUES (10, 'A', 1);
INSERT INTO curso (grado, salon, id_colegio) VALUES (10, 'B', 1);
INSERT INTO curso (grado, salon, id_colegio) VALUES (11, 'A', 1);
INSERT INTO curso (grado, salon, id_colegio) VALUES (11, 'B', 1);

/* Poblamos tabla profesor */

INSERT INTO profesor (nombre) VALUES ('Némesis');
INSERT INTO profesor (nombre) VALUES ('Príapo');
INSERT INTO profesor (nombre) VALUES ('Iris');

/* Poblamos tabla asignatura */

INSERT INTO asignatura (nombre, id_curso, id_profesor) VALUES ('Matemáticas', 1, 1);
INSERT INTO asignatura (nombre, id_curso, id_profesor) VALUES ('Matemáticas', 2, 1);
INSERT INTO asignatura (nombre, id_curso, id_profesor) VALUES ('Matemáticas', 3, 1);
INSERT INTO asignatura (nombre, id_curso, id_profesor) VALUES ('Matemáticas', 4, 1);
INSERT INTO asignatura (nombre, id_curso, id_profesor) VALUES ('Español', 1, 2);
INSERT INTO asignatura (nombre, id_curso, id_profesor) VALUES ('Español', 2, 2);
INSERT INTO asignatura (nombre, id_curso, id_profesor) VALUES ('Inglés básico', 1, 3);
INSERT INTO asignatura (nombre, id_curso, id_profesor) VALUES ('Inglés avanzado', 2, 3);
INSERT INTO asignatura (nombre, id_curso, id_profesor) VALUES ('Pre Icfes', 3, 1);
INSERT INTO asignatura (nombre, id_curso, id_profesor) VALUES ('Pre Icfes', 4, 1);

/* Poblamos tabla estudiante */

INSERT INTO estudiante (nombre) VALUES ('Afrodita');
INSERT INTO estudiante (nombre) VALUES ('Apolo');
INSERT INTO estudiante (nombre) VALUES ('Ares');
INSERT INTO estudiante (nombre) VALUES ('Artemisa');
INSERT INTO estudiante (nombre) VALUES ('Atenea');
INSERT INTO estudiante (nombre) VALUES ('Dionisio');
INSERT INTO estudiante (nombre) VALUES ('Hefesto');
INSERT INTO estudiante (nombre) VALUES ('Hera');
INSERT INTO estudiante (nombre) VALUES ('Hermes');
INSERT INTO estudiante (nombre) VALUES ('Hades');
INSERT INTO estudiante (nombre) VALUES ('Poseidón');
INSERT INTO estudiante (nombre) VALUES ('Zeus');

/* Poblamos la tabla detalle */

INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (1, 1);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (1, 5);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (1, 7);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (2, 1);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (2, 5);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (2, 7);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (3, 1);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (3, 5);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (3, 7);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (4, 2);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (4, 6);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (4, 8);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (5, 2);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (5, 6);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (5, 8);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (6, 2);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (6, 6);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (6, 8);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (7, 3);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (7, 9);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (8, 3);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (8, 9);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (9, 4);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (9, 10);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (10, 4);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (10, 10);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (11, 4);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (11, 10);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (12, 4);
INSERT INTO asignatura_estudiante (id_estudiante, id_asignatura) VALUES (12, 10);