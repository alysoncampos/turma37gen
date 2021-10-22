CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_estudantes(
	id_estudante INT AUTO_INCREMENT,
    matricula VARCHAR(255),
    nome VARCHAR(255),
    serie VARCHAR(255),
    nota DOUBLE NOT NULL,
    PRIMARY KEY(id_estudante)
);

INSERT INTO tb_estudantes (matricula, nome, serie, nota) 
VALUES
("111", "Alyson", "turma37", 9.0),
("222", "Bruna", "turma37", 9.0),
("333", "Arthur", "turma37", 9.0),
("444", "Babi", "turma37", 9.0),
("555", "Bárbara", "turma37", 9.0),
("666", "Vinicíus", "turma37", 9.0),
("777", "Maria", "turma37", 9.0),
("888", "Natália", "turma37", 9.0);

SELECT * FROM tb_estudantes;

SELECT * FROM tb_estudantes nota WHERE nota > 7;

SELECT * FROM tb_estudantes nota WHERE nota < 7;

UPDATE tb_estudantes SET nota = 5.0 WHERE id_estudante = 7;
