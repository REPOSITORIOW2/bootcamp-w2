## 1. O que é chamado de JOIN em um banco de dados?
O JOIN é a combinação de duas ou mais tabelas através de alguma chave ou valor comum entre elas.

## 2.  Nomeie e explique 2 tipos de JOIN.
**INNER JOIN**
Compara cada linha da tabela A com as linhas da tabela B para encontrar todos os pares de linhas que satisfazem a condição de junção.

**LEFT JOIN**
Para cada linha da tabela A, consulta e compara com todas as linhas da tabela B. Retorna todos os registros da tabela esquerda e os registros correspondentes da tabela direita.

## 3.  Para que é usado o GROUP BY?
A cláusula GROUP BY identifica as colunas de agrupamento para a consulta. Pode ser utilizada em conjunto com as funções SUM, AVG e COUNT, etc.

## 4. Para que é usado o HAVING?
A cláusula HAVING é semelhante a cláusula WHERE, a diferença é que ela é aplicada somente a grupos como um todo (ou seja, as linhas do conjunto de resultados que representam grupos), verificando as condições informadas após a agregação. 

## 5.  Dados os diagramas a seguir, indique a qual tipo de JOIN cada um corresponde:
**FIGURA 1 - INNER JOIN** <br/>
![INNER JOIN](https://javatutorial.net/wp-content/uploads/2018/02/sql-inner-join.png)

**FIGURA 2 - LEFT JOIN** <br/>
![LEFT JOIN](https://javatutorial.net/wp-content/uploads/2018/02/sql-left-join.png)

## 6. Escreva uma consulta genérica para cada um dos diagramas abaixo:
**CONSULTA 1**
```sql
SELECT C.NOME FROM CLIENTES C RIGHT JOIN PLANOS_ASSINATURA P ON C.PLANO_ASSINATURA_ID = P.ID
```
![RIGHT JOIN](https://javatutorial.net/wp-content/uploads/2018/02/sql-right-join.png)

**CONSULTA 2**
```sql
SELECT F.NOME, D.NOME FROM FUNCIONARIOS F FULL OUTER JOIN DEPARTAMENTOS D ON F.DEPARTAMENTO_ID = D.ID
```
![FULL OUTER JOIN](https://javatutorial.net/wp-content/uploads/2018/02/sql-outer-join.png)
