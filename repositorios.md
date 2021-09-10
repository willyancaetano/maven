## Repositórios

Um projeto possui dependências. Quando vamos compilar, executamos  `mvn compile`. Nesse momento, o Maven analisa as dependências do `pom.xml` e procura essas bibliotecas em algum lugar. Esse lugar são os **repositórios**. Assim, a principal função dos mesmos é manter os artefatos que são utilizados pelo Maven para executar.

### Tipos de repositórios

 - Local: É o repositório na máquina utilizado pelo Maven para buscar os artefatos. É uma estratégia de *caching*, para evitar uma busca toda vez que o Maven executa uma task. Fica na pasta do usuário no diretório `.m2\repository`
 - Remoto: É o local central utilizado pelo Maven para buscar os artefatos. Configurado automaticamente pelo Super POM para utilizar o [Maven Central](https://repo.maven.apache.org/maven2/)

### Como funciona

![alt=Acessa repositório Local](https://i.imgur.com/jMtLw1J.png)

Aqui executamos `mvn compile` e o Maven encontrou no repositório local os artefatos que foi necessário.

![alt=Repositório local não contém o artefato](https://i.imgur.com/ShnFrWY.png)

Um outro cenário, é que o artefato que o projeto necessita não existe no repositório local.

![alt=Repositório local não contém o artefato](https://i.imgur.com/SRmGP2i.png)

Nesse caso, o Maven busca no repositório remoto, encontra o artefato e armazena o mesmo no repositório local. Na próxima vez que o artefato for utilizado já estará no repo local.

### Configurando repositório remoto

#### Via settings.xml

 - Edite no arquivo `pasta_apache_maven/conf/settings.xml`, a tag `<mirrors>` incluindo o server que você deseja.
```xml
    <mirrors>
        <mirror>
            <id>internal-baeldung-repository</id>
            <name>Baeldung Internal Repo</name>
            <url>https://baeldung.com/repo/maven2/</url>
            <mirrorOf>*</mirrorOf>
        </mirror>
    </mirrors>
```

Essa configuração vai sobrescrever a configuração do `pom.xml`

#### Via pom.xml

No `pom.xml`, adicione a tag `<repositories>` e adicione o(s) repositório(s) que desejar.

```xml
<project>
	...
	<repositories>
		<repository>
			<id>my-internal-site</id>
			<url>https://myserver/repo</url>
		</repository>
	</repositories>
	...
</project>
```
