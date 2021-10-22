CREATE DATABASE db_rh ;

USE db_rh ;

CREATE TABLE tb_funcionarios(
	id_funcionario INT AUTO_INCREMENT,
    nome VARCHAR(255),
    email VARCHAR(255),
    cargo VARCHAR(255),
    salario DOUBLE NULL,
    PRIMARY KEY (id_funcionario)
);

INSERT INTO tb_funcionarios (nome, email, cargo, salario) 
VALUES 
("Arthur", "reizinhoambev@email.com", "Diretor Geral", 10000.00),
("Alyson", "alyssinho@email.com", "Degustador", 500.00),
("Amancio", "armario@email.com", "Designer", 5000.00),
("Bruna", "bruninha@email.com", "Conselheira Geral", 15000.00),
("Fernanda", "fernanda@email.com", "Diretora de Eventos", 5000.00);

SELECT * FROM tb_funcionarios;

SELECT * FROM tb_funcionarios WHERE salario > 2000;

SELECT * FROM tb_funcionarios WHERE salario < 2000;

UPDATE tb_funcionarios SET salario = 1000.00 WHERE id_funcionario = 2;

