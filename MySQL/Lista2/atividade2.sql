-- Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco deverá ter o seguinte nome db_pizzaria_legal.
CREATE DATABASE db_pizzaria_legal ;

-- O sistema trabalhará com 2 tabelas tb_categoria e tb_pizza.
USE db_pizzaria_legal ;

CREATE TABLE tb_categoria (
	id INT (5) AUTO_INCREMENT, 
    tamanho ENUM("Pequena", "Média", "Grande"),
    tipo ENUM("Salgada", "Doce"),
    PRIMARY KEY (id)
);

CREATE TABLE tb_pizza (
	id_pizza INT (10) AUTO_INCREMENT,
    sabor VARCHAR(255) NOT NULL,
    valor  DECIMAL(10,2) NOT NULL,
    borda ENUM('Sim', 'Não'),
    fk_categoria_id INT (5) NOT NULL,
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (fk_categoria_id) REFERENCES tb_categoria(id)
);

-- Popule esta tabela Categoria com até 5 dados.
INSERT INTO tb_categoria (tamanho, tipo) VALUES
("Pequena", "Salgada"),
("Média", "Salgada"),
("Grande", "Salgada"),
("Pequena", "Doce"),
("Média", "Doce");

-- Popule esta tabela pizza com até 8 dados.
INSERT INTO tb_pizza (sabor, valor, borda, fk_categoria_id) VALUES
("Calabresa", 41.99, "Não", 1),
("Nordestina", 65.00, "Sim", 2),
("Frango com bacon", 25.50, "Não", 3),
("Peperoni", 45.50, "Sim", 3),
("Bolo de rolo", 45.00, "Não", 4),
("Cartola", 25.70, "Não", 5);

-- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
SELECT * FROM tb_pizza WHERE valor > 45.00 ;

-- Faça um select trazendo  os Produtos com valor entre 29 e 60 reais.
SELECT * FROM tb_pizza WHERE valor BETWEEN 29 AND 60 ;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
SELECT * FROM tb_pizza WHERE sabor LIKE 'c%' ;

-- Faça um um select com Inner join entre  tabela categoria e pizza.
SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.fk_categoria_id ;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.fk_categoria_id 
WHERE tb_categoria.tipo = "Doce"
