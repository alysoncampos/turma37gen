-- Crie um banco de dados para um serviço de um açougue ou uma quitanda, o nome do banco deverá ter o seguinte nome db_cidade_das_carnes ou db_cidade_das_frutas
CREATE DATABASE db_cidade_das_frutas;

-- O sistema trabalhará com 2 tabelas tb_categoria e tb_produto.
USE db_cidade_das_frutas;

-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço dessa quitanda.
CREATE TABLE tb_categorias(
	id_categoria INT(10) AUTO_INCREMENT,
    tipo ENUM("Fruta", "Verdura", "Legumes"),
    estacao VARCHAR(50) NOT NULL,
	PRIMARY KEY (id_categoria)
);

-- Crie uma tabela de produtos e utilize a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço dessa quitanda.
CREATE TABLE tb_produtos (
	id_produto INT(10) AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL, 
    peso DECIMAL(10, 2) NOT NULL,
    fk_categoria INT(10) NOT NULL,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categorias (id_categoria),
    PRIMARY KEY (id_produto)
);

-- Popule esta tabela Categoria com até 5 dados.
INSERT INTO tb_categorias (tipo, estacao) VALUES
("Fruta", "Verão"),
("Fruta", "Outono"),
("Verdura", "Primavera"),
("Legumes", "Inverno"),
("Legumes", "Verão");

SELECT * FROM tb_categorias ;

-- Popule esta tabela Produto com até 8 dados.
INSERT INTO tb_produtos (nome, valor, peso, fk_categoria) VALUES
("Abacaxi", 5.99, 1.5, 1),
("Carambola", 7.99, 1.0, 2),
("Brocólis", 50.99, 2.0, 3),
("Abóbora", 5.99, 1.5, 4),
("Beterraba", 20.99, 1.5, 5),
("Chuchu", 10.99, 1.5, 5);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
SELECT * FROM tb_produtos WHERE valor > 50.00 ;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_produtos WHERE valor BETWEEN 3 AND 60 ;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
SELECT * FROM tb_produtos WHERE nome LIKE 'c%' ;

-- Faça um um select com Inner join entre  tabela categorias e produtos.
SELECT * FROM tb_produtos
	INNER JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_categoria ;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são aves ou legumes).
SELECT * FROM tb_produtos
	INNER JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_categoria 
WHERE tb_categorias.tipo = "Legumes"
