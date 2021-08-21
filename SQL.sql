CREATE TABLE cursos(
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR (60) NOT NULL,
    codigo INT(5) NOT NULL,
    jornada VARCHAR(1) DEFAULT 'M',
    PRIMARY KEY (id)
);

