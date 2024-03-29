SELECT * 
FROM estados;

SELECT 
      Sigla, 
      nome as 'Nome do Estado' 
FROM estados
WHERE regiao = 'sul';

SELECT 
      nome, 
      regiao,
      populacao FROM estados
WHERE populacao >= 10
ORDER BY populacao desc;