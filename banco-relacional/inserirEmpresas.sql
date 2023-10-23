ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

INSERT INTO empresas
    (nome, cnpj)
VALUES
    ('Empresa A', 31685586000107),
    ('Empresa B', 27764080000108),
    ('Empresa C', 26032632000120);

desc empresas;
desc prefeitos;

SELECT * FROM cidades;

INSERT INTO empresas_unidades 
    (empresa_id, cidade_id, sede)
VALUES 
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);

SELECT * FROM EMPRESAS_UNIDADES;