## Repositórios

Um projeto possui dependências. Quando vamos compilar, executamos  `mvn compile`. Nesse momento, o Maven analisa as dependências do `pom.xml` e procura essas bibliotecas em algum lugar. Esse lugar são os **repositórios**. Assim, a principal função dos mesmos é manter os artefatos que são utilizados pelo Maven para executar.

### Tipos de repositórios

 - Local: É o repositório na máquina utilizado pelo Maven para buscar os artefatos. É uma estratégia de *caching*, para evitar uma busca toda vez que o Maven executa uma task. Fica na pasta do usuário no diretório `.m2\repository`
 - Remoto: É o local central utilizado pelo Maven para buscar os artefatos. Configurado automaticamente pelo Super POM para utilizar o [Maven Central](https://repo.maven.apache.org/maven2/)

### Como funciona

![alt=Acessa repositório Local](https://i.imgur.com/jMtLw1J.png)
