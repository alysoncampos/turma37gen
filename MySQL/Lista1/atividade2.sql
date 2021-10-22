CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
id_produto INT AUTO_INCREMENT,
nome VARCHAR(255),
valor DOUBLE NOT NULL,
marca VARCHAR(255),
codigo VARCHAR(255),
PRIMARY KEY(id_produto)
);

INSERT INTO tb_produtos(nome, valor, marca, codigo) 
VALUES 
("Monitor", 1500.00, "CCE", "P-001"),
("Teclado", 250.00, "Alien", "P-002"),
("Mouse", 78.90, "eoxGame", "P-003"),
("Phone", 540.0, "hp", "P-004"),
("Mousepad", 30.99, "DELL", "P-005"),
("Carregador", 59.75, "Sony", "P-006"),
("Cabo HDMI", 25.40, "marca anonima", "P-007")
;

INSERT INTO tb_produtos(nome, valor, marca, codigo) VALUES 
("Cadeira", 2500.00, "DX-RACER", "P-008");

SELECT * FROM tb_produtos valor WHERE valor>500;

SELECT * FROM tb_produtos valor WHERE valor<500;

UPDATE tb_produtos SET valor = 570.00 where id_produto = 4;