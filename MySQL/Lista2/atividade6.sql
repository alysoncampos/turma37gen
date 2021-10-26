-- Crie um banco de dados para um serviço de um site de cursos onlines, o nome do banco deverá ter o seguinte nome db_cursoDaMinhaVida.
CREATE DATABASE db_cursoDaMinhaVida;

-- O sistema trabalhará com 2 tabelas tb_curso e tb_categoria.
USE db_cursoDaMinhaVida;

-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria
CREATE TABLE tb_categorias(
	id_categoria INT(10) AUTO_INCREMENT,
    tipo ENUM("Front-End", "Back-End", "Fullstack"),
    turno ENUM("Manhã", "Tarde", "Noite"),
	PRIMARY KEY (id_categoria)
);

-- Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5 atributos relevantes dos tb_produto
CREATE TABLE tb_cursos (
	id_curso INT(10) AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL, 
    duracao_dias INT(10) NOT NULL,
    fk_categoria INT(10) NOT NULL,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categorias (id_categoria),
    PRIMARY KEY (id_curso)
);

-- Popule esta tabela Categoria com até 5 dados.
INSERT INTO tb_categorias (tipo, turno) VALUES
("Front-End", "Manhã"),
("Front-End", "Tarde"),
("Back-End", "Noite"),
("Fullstack", "Manhã"),
("Fullstack", "Noite");

-- Popule esta tabela Produto com até 8 dados.
INSERT INTO tb_cursos (nome, valor, duracao_dias, fk_categoria) VALUES
("Java", 189.99, 90, 3),
("Portugol", 99.99, 45, 3),
("SQL", 59.99, 30, 4),
("Spring", 35.99, 30, 5),
("JavaScript+HTML+CSS", 300.99, 120, 1),
("Dev. Java Jr.", 99.99, 45, 4);

-- Faça um select que retorne os Cursos com o valor maior do que 50 reais.
SELECT * FROM tb_cursos WHERE valor > 50.00 ;

-- Faça um select trazendo  os Cursos com valor entre 3 e 60 reais.
SELECT * FROM tb_cursos WHERE valor BETWEEN 3 AND 60 ;

-- Faça um select  utilizando LIKE buscando os Cursos com a letra J.
SELECT * FROM tb_cursos WHERE nome LIKE 'j%' ;

-- Faça um um select com Inner join entre  tabela categorias e cursos.
SELECT * FROM tb_cursos
	INNER JOIN tb_categorias ON tb_categorias.id_categoria = tb_cursos.fk_categoria ;
    
-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria Back-End).
SELECT * FROM tb_cursos
	INNER JOIN tb_categorias ON tb_categorias.id_categoria = tb_cursos.fk_categoria 
WHERE tb_categorias.tipo = "Back-End" ;
