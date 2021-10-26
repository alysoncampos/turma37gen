-- Crie um banco de dados para um serviço de uma loja de produtos de construção, o nome do banco deverá ter o seguinte nome db_construindo_a_nossa_vida
CREATE DATABASE db_construindo_a_nossa_vida;

-- O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.
USE db_construindo_a_nossa_vida;

-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce.
CREATE TABLE tb_categorias(
	id_categoria INT(10) AUTO_INCREMENT,
    categoria ENUM("Construção", "Elétrica", "Hidráulica", "Tintas"),
    corredor INT(8) NOT NULL,
	PRIMARY KEY (id_categoria)
);

-- Crie uma tabela de tb_produto e utilize a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço de uma loja de produtos
CREATE TABLE tb_produtos (
	id_produto INT(10) AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL, 
    estoque INT(10) NOT NULL,
    fk_categoria INT(10) NOT NULL,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categorias (id_categoria),
    PRIMARY KEY (id_produto)
);

-- Popule esta tabela Categoria com até 5 dados.
INSERT INTO tb_categorias (categoria, corredor) VALUES
("Construção", 1),
("Construção", 2),
("Elétrica", 3),
("Hidráulica", 6),
("Tintas", 9);

SELECT * FROM tb_categorias ;

-- Popule esta tabela Produto com até 8 dados.
INSERT INTO tb_produtos (nome, valor, estoque, fk_categoria) VALUES
("Cimento", 11.99, 8, 1),
("Telhas", 50.99, 10, 2),
("Tinta A", 29.99, 7, 5),
("Tinta B", 35.99, 10, 5),
("Torneira Inox", 60.99, 5, 4),
("Lampada", 2.99, 2, 3);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
SELECT * FROM tb_produtos WHERE valor > 50.00 ;

-- Faça um select trazendo  os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_produtos WHERE valor BETWEEN 3 AND 60 ;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
SELECT * FROM tb_produtos WHERE nome LIKE 'c%' ;

-- Faça um um select com Inner join entre  tabela categorias e produtos.
SELECT * FROM tb_produtos
	INNER JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_categoria ;
    
-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria hidráulica).
SELECT * FROM tb_produtos
	INNER JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_categoria 
WHERE tb_categorias.categoria = "Construção"