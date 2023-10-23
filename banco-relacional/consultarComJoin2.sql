SELECT c.id as 'ID da Cidade', 
       c.nome as 'Nome da Cidade',
       p.id as 'ID do Prefeito',
       p.nome as 'Nome do Prefeito'  
FROM Cidades c INNER JOIN Prefeitos p ON c.id = p.cidade_id;

SELECT c.id as 'ID da Cidade', 
       c.nome as 'Nome da Cidade',
       p.id as 'ID do Prefeito',
       p.nome as 'Nome do Prefeito' 
FROM Cidades c LEFT JOIN Prefeitos p ON c.id = p.cidade_id;

SELECT c.id as 'ID da Cidade', 
       c.nome as 'Nome da Cidade',
       p.id as 'ID do Prefeito',
       p.nome as 'Nome do Prefeito' 
FROM Cidades c RIGHT JOIN Prefeitos p ON c.id = p.cidade_id;

SELECT c.id as 'ID da Cidade', 
       c.nome as 'Nome da Cidade',
       p.id as 'ID do Prefeito',
       p.nome as 'Nome do Prefeito' 
FROM Cidades c LEFT JOIN Prefeitos p ON c.id = p.cidade_id
UNION
SELECT c.id as 'ID da Cidade', 
       c.nome as 'Nome da Cidade',
       p.id as 'ID do Prefeito',
       p.nome as 'Nome do Prefeito' 
FROM Cidades c RIGHT JOIN Prefeitos p ON c.id = p.cidade_id;