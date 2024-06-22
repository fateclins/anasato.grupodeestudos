
CREATE DATABASE IF NOT EXISTS grupo_de_estudos;


USE grupo_de_estudos;


CREATE TABLE Alunos (
    ID_Aluno INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    Senha VARCHAR(100) NOT NULL
);


CREATE TABLE Encontros (
    ID_Encontro INT PRIMARY KEY AUTO_INCREMENT,
    Assunto VARCHAR(100) NOT NULL,
    Dia_Semana VARCHAR(20) NOT NULL,
    Hora_Inicio TIME NOT NULL,
    Hora_Termino TIME NOT NULL,
    Max_Participantes INT NOT NULL
);


CREATE TABLE Participacao (
    ID_Participacao INT PRIMARY KEY AUTO_INCREMENT,
    ID_Aluno INT NOT NULL,
    ID_Encontro INT NOT NULL,
    FOREIGN KEY (ID_Aluno) REFERENCES Alunos(ID_Aluno),
    FOREIGN KEY (ID_Encontro) REFERENCES Encontros(ID_Encontro)
);
