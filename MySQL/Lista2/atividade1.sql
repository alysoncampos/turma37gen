-- Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter o seguinte nome db_generation_game_online.
CREATE DATABASE db_generation_game_online ;

-- O sistema trabalhará com 2 tabelas tb_classe e tb_personagem.
USE db_generation_game_online ;

CREATE TABLE tb_classes (
	id_classe INT AUTO_INCREMENT,
    tipo ENUM ("Guerreiro", "Mago", "Curandeiro", "Gatuno"),
    equipamento_especial ENUM ("Sim", "Não"),
    PRIMARY KEY (id_classe)
);

CREATE TABLE tb_personagens (
	id_personagem INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    poder_ataque INT NOT NULL, 
    poder_defesa INT NOT NULL, 
    agilidade INT NOT NULL,
    fk_classe_id INT NOT NULL,
    FOREIGN KEY (fk_classe_id) REFERENCES tb_classes(id_classe),
    PRIMARY KEY (id_personagem)
);

-- Popule esta tabela classe com até 5 dados.
INSERT INTO tb_classes (tipo, equipamento_especial) VALUES 
("Guerreiro", "Sim"),
("Mago", "Não"),
("Gatuno", "Sim"),
("Curandeiro", "Não");

-- Popule esta tabela personagem com até 8 dados.
INSERT INTO tb_personagens (nome, poder_ataque, poder_defesa, agilidade, fk_classe_id) VALUES
("Chun-Li", 5000, 5000, 100, 1),
("Terry Bogard", 4500, 4500, 99, 3),
("Kratos", 5500, 4000, 70, 1),
("Demogorgo", 10.000, 800, 70, 3),
("Gnomo Voador", 4000, 5500, 100, 2),
("Amancio", 1010, 3500, 2000, 1);

-- Faça um select que retorne os personagens com o poder de ataque maior do que 2000.
SELECT * FROM tb_personagens WHERE poder_ataque > 2000 ;

-- Faça um select trazendo  os personagens com poder de defesa entre 1000 e 2000.
SELECT * FROM tb_personagens WHERE poder_defesa BETWEEN 1000 AND 2000 ;

-- Faça um select  utilizando LIKE buscando os personagens com a letra C.
SELECT * FROM tb_personagens WHERE nome LIKE 'c%' ;

-- Faça um um select com Inner join entre  tabela classe e personagem.
SELECT * FROM tb_personagens
	INNER JOIN tb_classes ON tb_classes.id_classe = tb_personagens.fk_classe_id ;

-- Faça um select onde traga todos os personagem de uma classe específica (exemplo todos os personagens que são arqueiros).
SELECT * FROM tb_personagens
	INNER JOIN tb_classes ON tb_classes.id_classe = tb_personagens.fk_classe_id
WHERE id_classe = 3 ;







