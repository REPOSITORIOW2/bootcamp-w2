DROP DATABASE cinema;

CREATE DATABASE cinema;

USE cinema;

SHOW tables;

CREATE TABLE nacionalidades(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(128) NOT NULL,
    CONSTRAINT pk_nacionalidades PRIMARY KEY(id)
);

CREATE TABLE estudios(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(128) NOT NULL,
    CONSTRAINT pk_estudios PRIMARY KEY(id)
);

CREATE TABLE filmes(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(128) NOT NULL,
    lancamento DATE NOT NULL, 
    nacionalidade_id BIGINT NOT NULL,
    estudio_id BIGINT NOT NULL,
    CONSTRAINT pk_filmes PRIMARY KEY(id),
    CONSTRAINT fk_filmes_nacionalidade_id FOREIGN KEY (nacionalidade_id) REFERENCES nacionalidades (id),
    CONSTRAINT fk_filmes_estudio_id FOREIGN KEY (estudio_id) REFERENCES estudios (id)
);

CREATE TABLE atores(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(128) NOT NULL,
    nacionalidade_id BIGINT NOT NULL,
    CONSTRAINT pk_atores PRIMARY KEY (id),
    CONSTRAINT fk_atores_nacionalidade_id FOREIGN KEY (nacionalidade_id) REFERENCES nacionalidades(id)
);

CREATE TABLE atores_filmes(
    id BIGINT AUTO_INCREMENT,
    ator_id BIGINT NOT NULL,
    filme_id BIGINT NOT NULL,
    CONSTRAINT pk_atores_filmes PRIMARY KEY (id),
    CONSTRAINT fk_atores_filmes_ator_id FOREIGN KEY (ator_id) REFERENCES atores(id),
    CONSTRAINT fk_atores_filmes_filmes_id FOREIGN KEY (filme_id) REFERENCES filmes(id)
);

CREATE TABLE diretores(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(128) NOT NULL,
    nacionalidade_id BIGINT NOT NULL,
    CONSTRAINT pk_diretores PRIMARY KEY (id),
    CONSTRAINT fk_diretores_nacionalidade_id FOREIGN KEY (nacionalidade_id) REFERENCES nacionalidades(id)
);

CREATE TABLE filmes_diretores(
    id BIGINT AUTO_INCREMENT,
    filme_id BIGINT NOT NULL,
    diretor_id BIGINT NOT NULL,
    CONSTRAINT pk_filmes_diretores PRIMARY KEY (id),
    CONSTRAINT fk_filmes_diretores_filme_id FOREIGN KEY (filme_id) REFERENCES filmes(id),
    CONSTRAINT fk_filmes_diretores_diretor_id FOREIGN KEY (diretor_id) REFERENCES diretores(id)
);



INSERT INTO nacionalidades (nome) VALUES 
    ("Brasil"),
    ("EUA"),
    ("França"),
    ("Inglaterra"),
    ("China"),
    ("Japão"),
    ("Africa do Sul"),
    ("Austria");

INSERT INTO estudios (nome) VALUES 
    ("Marvel Studios"),
    ("Warner Bros."),
    ("Columbia Pictures"),
    ("Sony"),
    ("Paramount Pictures"),
    ("Columbia Tristar"),
    ("Universal Studios");

INSERT INTO atores (nome, nacionalidade_id) VALUES 
    ("Scarlet Johansson", 2),
    ("Chris Hemsworth", 2),
    ("Elizabeth Olsen", 2),
    ("Robert Downey Jr.", 2),
    ("Mark Hamill", 2),
    ("Chris Pratt", 2),
    ("Vincent Cassell", 3),
    ("Jean Reno", 3),
    ("Vin Diesel", 2),
    ("Omar Sy", 3),
    ("Wagner Moura", 1),
    ("Matt Damon", 2),
    ("Jackie Chan", 5),
    ("Wen Watanabe", 6),
    ("Arnold Schwarzenegger", 7),
    ("Sylvester Stallone", 2),
    ("Fausto Silva", 1),
    ("Renato Aragorn", 1),
    ("Peter Capaldi", 4);

INSERT INTO diretores (nome, nacionalidade_id) VALUES 
    ("Anthony Russo", 2),
    ("Joe Russo", 2),
    ("Steven Spielberg", 2),
    ("Alfred Hitchcock", 2),
    ("Chen Kaige", 5),
    ("Jia Zhangke", 5),
    ("Ang Lee", 5),
    ("Zack Snyder", 2),
    ("Neill Blomkamp", 2),
    ("James Cameron", 2),
    ("James Gunn", 2),
    ("Edgar Wright", 6);

INSERT INTO filmes (
        nome, 
        lancamento, 
        nacionalidade_id, 
        estudio_id) VALUES 
    ("Vingadores: Guerra Infinita", "2018-04-23", 2, 1),
    ("Thor Ragnarok", "2017-10-27", 2, 1),
    ("Zack Snyder's Justice League", "2020-03-18", 2, 1),
    ("Elysium", "2013-08-16", 2, 4),
    ("Sherlock Holmes", "2009-10-10", 2, 2),
    ("Spider-man Into de SpiderVerse", "2018-09-14", 4, 4),
    ("Exterminador do Futuro", "1984-10-26", 2, 4),
    ("The Esquadrão Suicida", "2021-06-30", 2, 2),
    ("Inspetor Faustão e o Mallandro", "1991-01-01", 1, 6),
    ("Velozes e Furiosos 17 - Guerra no Multiverso", "2030-12-30", 2, 5),
    ("Guardiões da Galáxia", "2014-08-14", 2, 1),
    ("Guardiões da Galáxia 2", "2017-04-10", 2, 1),
    ("Shaun of the Dead", "2004-04-09", 2, 7);

INSERT INTO filmes_diretores (filme_id, diretor_id) VALUES 
    (1, 1),
    (1, 2),
    (2, 3),
    (2, 4),
    (2, 4),
    (3, 2),
    (6, 3),
    (6, 4),
    (7, 1),
    (7, 1),
    (5, 2);

INSERT INTO atores_filmes (ator_id, filme_id) VALUES 
    (1, 1),
    (1, 2),
    (2, 3),
    (10, 2),
    (10, 4),
    (9, 5),
    (5, 2),
    (5, 3),
    (5, 6),
    (2, 8),
    (10, 3),
    (8, 1),
    (3, 2),
    (6, 3),
    (6, 4),
    (7, 1),
    (7, 6),
    (5, 10);

SELECT 
	n.nome AS NomeNacionalidade, 
	a.id, a.nome AS NomeAtor 
	FROM atores a 
	INNER JOIN nacionalidades n ON n.id = a.nacionalidade_id;
    
SELECT * FROM filmes WHERE EXTRACT(YEAR from filmes.lancamento) BETWEEN '2000' AND '2013';

SELECT 
	estudios.nome AS NomeEstudio,
    filmes.nome, 
    filmes.lancamento 
    FROM filmes 
    JOIN estudios ON estudios.id = filmes.estudio_id
    WHERE estudios.nome = 'Sony'
    ORDER BY filmes.lancamento;
    
SELECT 
	estudios.nome,
    COUNT(estudios.nome)
    from estudios INNER JOIN filmes ON filmes.estudio_id = estudios.id
    GROUP BY estudios.nome
    HAVING COUNT(estudios.nome) >= 3;
    
SELECT
	COUNT(nacionalidades.nome) as NumeroAtores,
	nacionalidades.nome as Nacionalidade
    FROM nacionalidades INNER JOIN atores ON atores.nacionalidade_id = nacionalidades.id
    GROUP BY nacionalidades.nome
    HAVING COUNT(nacionalidades.nome) >= 2;

SELECT DISTINCT
	atores.nome AS NomeAtor,
    diretores.nome AS NomeDiretor 
    FROM filmes_diretores fd
    INNER JOIN atores_filmes af ON af.filme_id = fd.filme_id
    INNER JOIN atores ON atores.id = af.ator_id 
    INNER JOIN diretores ON diretores.id = fd.diretor_id
    ORDER BY diretores.nome, atores.nome;
    
SELECT
	COUNT(atores.nome) as NumeroAtores,
    diretores.nome AS NomeDiretor 
    FROM filmes_diretores fd
    INNER JOIN atores_filmes af ON af.filme_id = fd.filme_id
    INNER JOIN atores ON atores.id = af.ator_id 
    INNER JOIN diretores ON diretores.id = fd.diretor_id
    GROUP BY (diretores.nome);
    
SELECT
	diretores.nome as NomeDiretor,
    atores.nome as NomeAutor,
	COUNT(atores.nome) as NumeroFilmes 
    FROM filmes_diretores fd
    INNER JOIN filmes ON fd.filme_id = filmes.id
    INNER JOIN atores_filmes af ON af.filme_id = fd.filme_id
    INNER JOIN atores ON atores.id = af.ator_id 
    INNER JOIN diretores ON diretores.id = fd.diretor_id
    GROUP BY diretores.nome, atores.nome
    ORDER BY NumeroFilmes DESC;
    
