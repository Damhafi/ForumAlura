CREATE TABLE curso (
    id SERIAL PRIMARY KEY,
    nome TEXT UNIQUE NOT NULL,
    categoria TEXT UNIQUE NOT NULL
);