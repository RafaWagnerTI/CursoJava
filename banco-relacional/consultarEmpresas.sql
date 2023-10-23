select e.nome as Empresa, 
       c.nome as Cidade, 
      CASE WHEN eu.sede = 1 THEN 'SEDE' ELSE 'FILIAL' END AS 'Situação'
from empresas e inner join empresas_unidades eu on (e.id = eu.empresa_id)
                inner join cidades c on (eu.cidade_id = c.id);