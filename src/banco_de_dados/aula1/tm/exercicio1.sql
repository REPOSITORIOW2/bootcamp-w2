CREATE TABLE nacionalidades(
id SERIAL NOT NULL,
pais VARCHAR(200) NOT NULL,
CONSTRAINT pk_nacionalidades PRIMARY KEY(id)
);

CREATE TABLE diretores(
  id SERIAL NOT NULL,
  nome VARCHAR(200) NOT NULL,
  sexo VARCHAR(1) NOT NULL,
  nascimento DATE NOT NULL,
  nacionalidade_id INTEGER NOT NULL,
  CONSTRAINT pk_diretores PRIMARY KEY(id),
  CONSTRAINT fk_nacionalidades_diretores FOREIGN KEY(nacionalidade_id) REFERENCES nacionalidades(id)
);

CREATE TABLE atores(
  id SERIAL NOT NULL,
  nome VARCHAR(200) NOT NULL,
  nacionalidade_id INTEGER NOT NULL,
  CONSTRAINT pk_atores PRIMARY KEY(id),
  CONSTRAINT fk_nacionalidades_atores FOREIGN KEY(nacionalidade_id) REFERENCES nacionalidades(id)
);

CREATE TABLE filmes(
  id SERIAL NOT NULL,
  nome VARCHAR(200) NOT NULL,
  lancamento DATE NOT NULL,
  estudio VARCHAR(200) NOT NULL,
  nacionalidade_id INTEGER NOT NULL,
  diretor_id INTEGER NOT NULL,
  CONSTRAINT pk_filmes PRIMARY KEY(id),
  CONSTRAINT fk_nacionalidades_filmes FOREIGN KEY(nacionalidade_id) REFERENCES nacionalidades(id),
  CONSTRAINT fk_diretor_filme FOREIGN KEY(diretor_id) REFERENCES diretores(id)
);

CREATE TABLE filmes_participacao(
  id SERIAL NOT NULL,
  filme_id INTEGER NOT NULL,
  ator_id INTEGER NOT NULL,
  UNIQUE(filme_id, ator_id),
  CONSTRAINT pk_filmes_participacao PRIMARY KEY(id),
  CONSTRAINT fk_filme_id FOREIGN KEY(filme_id) REFERENCES filmes(id),
  CONSTRAINT fk_ator_id FOREIGN KEY(ator_id) REFERENCES atores(id)
);