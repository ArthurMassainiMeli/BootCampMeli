USE movies_db;
-- Mostre o título e o nome do gênero de todas as séries.

SELECT * FROM movies;
SELECT * FROM series;
SELECT * FROM genres;

SELECT s.title, g.`name`
FROM series AS `s`
INNER JOIN genres AS `g`
ON s.genre_id = g.id;

-- Mostre o título dos episódios, o nome e o sobrenome dos atores que atuam em cada um deles.

SELECT * FROM episodes;
SELECT * FROM actors;
SELECT * FROM actor_episode;

SELECT e.title, a.first_name, a.last_name
FROM episodes AS `e`
INNER JOIN actor_episode AS `ae`
ON e.id = ae.episode_id
INNER JOIN actors AS `a`
ON a.id = ae.actor_id;

-- Mostre o título de todas as séries e o número total de temporadas que cada uma delas possui.

SELECT * FROM series;
SELECT * FROM seasons;

SELECT s.title, COUNT(s.id) AS `qtd-seasons`
FROM series AS `s`
INNER JOIN seasons AS `se`
ON s.id = se.serie_id
GROUP BY s.title;

-- Mostre o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior ou igual a 3.

SELECT * FROM genres;
SELECT * FROM movies;

SELECT g.`name`, COUNT(m.id) AS `total_movies`
FROM genres AS `g`
INNER JOIN movies AS `m`
ON g.id = m.genre_id
GROUP BY g.`name`;

-- Mostre apenas o nome e o sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.

SELECT DISTINCT a.first_name, a.last_name 
FROM actors AS `a`
INNER JOIN actor_movie AS `am`
ON a.id = am.actor_id
INNER JOIN movies AS `m`
ON m.id = am.movie_id
WHERE m.title LIKE '%galaxia%';


