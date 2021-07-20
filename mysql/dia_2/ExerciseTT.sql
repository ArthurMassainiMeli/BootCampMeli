-- 01. Explique o conceito de normalização e para que é usado.

-- RESPOSTA: Normalização é uma tecnica para organizar tabelas relacionais com o objetivo de reduzir a redundância dos dados

-- COMANDO PARA HABLITAR A EXCLUSAO E UPDATE DE DADOS SEM USAR O ID PARA OS PROXIMOS EXERCICIOS
SET SQL_SAFE_UPDATES = 0;

-- 02. Adicione um filme à tabela de filmes.

SELECT * FROM movies;
INSERT INTO movies (title, rating, awards, release_date, length, genre_id) 
values ("O senhor dos anéis", 10.0, 20, "2001-01-23", 350, 5);


-- 03. Adicione um gênero à tabela de gêneros.

SELECT * FROM genres;
INSERT INTO genres (created_at, `name`, ranking, `active`) 
values (NOW(), 'Gore', 13, 1);


-- 04. Associe o filme do Ex 2. ao gênero criado no Ex. 3.

SELECT * FROM movies;
SELECT * FROM genres;

UPDATE movies SET genre_id = 13
WHERE id = 22;


-- 05. Modifique a tabela de atores para que pelo menos um ator adicione como favorito o filme adicionado no Ex. 2.

SELECT * FROM actors;

UPDATE actors SET favorite_movie_id = 22
WHERE id IN (1,5,6);

-- 06. Crie uma cópia temporária da tabela de filmes.


SELECT * FROM movies_temp;
SELECT * FROM movies;

CREATE TEMPORARY TABLE movies_temp
SELECT * FROM movies;


-- 07. Elimine desta tabela temporária todos os filmes que ganharam menos de 5 prêmios.

SELECT * FROM movies_temp;

DELETE FROM movies_temp
WHERE awards < 5;

-- 08. Obtenha a lista de todos os gêneros que possuem pelo menos um filme.

SELECT * FROM genres;
SELECT * FROM movies;

SELECT g.`name`
FROM genres AS `g`
INNER JOIN movies AS `m`
ON g.id = m.genre_id
GROUP BY g.`name`;


-- 09. Obtenha a lista de atores cujo filme favorito ganhou mais de 3 prêmios.

SELECT * FROM actors;
SELECT * FROM movies;

SELECT CONCAT(a.first_name, ' ', a.last_name) AS `Full Name`
FROM actors AS `a`
INNER JOIN movies AS `m`
ON m.id = a.favorite_movie_id
WHERE m.awards > 3
GROUP BY `Full Name`
ORDER BY `Full Name`;


-- 10. Use o plano de explicação para analisar as consultas nos Ex. 6 e 7.

-- nao pode usar EXPLAIN aqui
CREATE TEMPORARY TABLE movies_temp
SELECT * FROM movies;

EXPLAIN FORMAT=JSON DELETE FROM movies_temp
WHERE awards < 5;

-- 11. O que são os índices? Para que servem?

-- RESPOSTA: O índice é uma forma de estruturar dados de uma maneira mais eficiente para que sejam encontradas mais rapidamente

-- 12. Crie um índice sobre o nome na tabela de filmes.

SELECT title FROM movies
WHERE title LIKE '%Harry%';  # QUERY COST: 2.45

# INDEX NORMAL
CREATE INDEX title_index ON movies(title);

# FULLTEXT INDEX
CREATE FULLTEXT INDEX title_index_text ON movies(title);

-- 13. Verifique se o índice foi criado corretamente.

SELECT title FROM movies
WHERE MATCH(title) AGAINST('Harry');  # QUERY COST: 0.35

DROP INDEX title_index ON movies;
DROP INDEX title_index_text ON movies;

