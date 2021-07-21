# Configuração local do MySQL

## Exercício 1: Para realizar os exercícios, será necessário configurar o MySQL da seguinte maneira:
### 1.  *Crie um novo usuário MySQL com a seguinte configuração*

* nome de usuário: ml_app_user1 
* servidor: localhost 
* password: ml_app_user1 
```sql 
CREATE USER 'ml_app_user1'@'localhost' IDENTIFIED BY 'ml_app_user1'; 
```

* base de dados para o usuário: ml_app_consultorio 
* charset/collation: utf8_spanish_ci 
```sql
CREATE DATABASE ml_app_consultorio CHARACTER SET utf8 COLLATE utf8_spanish_ci;
```
* sem privilégios globais 

```sql
GRANT SELECT, INSERT, UPDATE, DELETE, INDEX, ALTER, CREATE TEMPORARY TABLES, LOCK TABLES ON ml_app_consultorio.* TO 'ml_app_user1'@'localhost';
```


### 2. *Depois que o usuário for criado, faça login como um usuário ml_app_user1 e verifique se o banco de dados foi criado ml_app_consultorio.* 

```sql
mysql -u ml_app_user1 -pml_app_user1
```
<span style="color:green"> Response: </span>
|Database|
|:--------------------:|
| information_schema |
| ml_app_consultorio |


```sql
CREATE DATABASE teste;
```
<span style="color:green"> Response: </span>

ERROR 1044 (42000): Access denied for user 'ml_app_user1'@'localhost' to database 'teste'

### 3. *Como usuário ml_app_user1, verifique se você não pode excluir o banco de dados, nem criar outro banco de dados (por exemplo, o banco de dados ml_app_1_bd1)*

```sql
DROP DATABASE ml_app_consultorio;
```
<span style="color:green"> Response: </span>

ERROR 1044 (42000): Access denied for user 'ml_app_user1'@'localhost' to database 'ml_app_consultorio'

#

## Exercicio 2: Para realizar os exercícios, será necessário configurar o MySQL da seguinte maneira: 
### 1. Crie um novo usuário MySQL com a seguinte configuração
* nome de usuário: ml_app_user2 
* servidor: localhost 
* senha: ml_app_ user2 
```sql
CREATE USER 'ml_app_user2'@'localhost' IDENTIFIED BY 'ml_app_user2'; 
```
* base de dados para o usuario: ml_app_consultorio 
* com todos os privilégios
```sql
GRANT ALL PRIVILEGES ON ml_app_consultorio.* TO 'ml_app_user2'@'localhost';
```

### 2. Depois que o usuário for criado, faça login como um usuário ml_app_user2 
```
mysql -uml_app_user2 -pml_app_user2
```

### 3. Como usuario ml_app_user2, verifique se você tem todos os privilégios

```sql 
SHOW GRANTS;
```
<span style="color:green"> Response: </span>

| Grants for ml_app_user2@localhost                      |
|:------------------------------------------------------------------------------:|
| GRANT USAGE ON *.* TO `ml_app_user2`@`localhost`               |
| GRANT ALL PRIVILEGES ON `ml_app_consultorio`.* TO `ml_app_user2`@`localhost` |

#

## Exercício 3: Para realizar os exercícios, será necessário configurar o MySQL da seguinte maneira: 
### 1. Crie um novo usuário MySQL com a seguinte configuração
* nome de usuário: ml_app_user3 
* servidor: localhost 
* senha: ml_app_ user3 
```sql
CREATE USER 'ml_app_user3'@'localhost' IDENTIFIED BY 'ml_app_user3'; 
```
* base de dados para o usuário: ml_app_consultorio 
* com privilégios SELECT 
```sql
GRANT SELECT ON ml_app_consultorio.* TO 'ml_app_user3'@'localhost'; 
```

### 2. Depois que o usuário for criado, faça login como um usuário ml_app_user3 e verifique se você tem privilégios de seleção para o banco de dados ml_app_consultorio.
```sql 
SHOW GRANTS;
```
<span style="color:green"> Response: </span>

| Grants for ml_app_user3@localhost                  |
|:----------------------------------------------------------------------:|
| GRANT USAGE ON *.* TO `ml_app_user3`@`localhost`           |
| GRANT SELECT ON `ml_app_consultorio`.* TO `ml_app_user3`@`localhost` |
