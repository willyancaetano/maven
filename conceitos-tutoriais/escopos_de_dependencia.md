## Escopos

### O que são escopos de dependência

Quando uma dependência é inserida em um projeto ela fica disponível pro `classpath` do projeto. O Maven cuida do `classpath` em várias fases: Na fase de construir, testar e rodar. O escopo da dependência é justamente isso: informar para o Maven para que contexto aquela dependência deve estar disponível.

### Escopos

#### compile
O escopo `compile` é o padrão. Se não informado, toda dependência por *default* é `compile`. Este escopo está disponível em todos os classpaths construídos pelo Maven. Vale ressaltar que esse escopo é transitivo.

```xml
<dependency>
    <groupId>tech.beepbeep</groupId>
    <artifactId>common</artifactId>
    <version>1.1.7-dev</version>
</dependency>
```
Veja que nessa declaração não informamos o escopo. Ela por padrão é `compile`. A declaração abaixo informa o escopo. Lembre-se de utilizar a tag `scope`.

```xml
<dependency>
    <groupId>tech.beepbeep</groupId>
    <artifactId>common</artifactId>
    <version>1.1.7-dev</version>
    <scope>compile</scope>
</dependency>
```

#### test
Indica que a dependência é utilizada apenas para compilar e executar os testes.  Geralmente é utilizado por bibliotecas utilizadas para testes, como por exemplo jUnit & Mockito. Vale ressaltar que esse escopo não é transitivo.

```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>3.12.4</version>
    <scope>test</scope>
</dependency>
```
#### runtime
Indica que a dependência não é necessário para compilar, mas para executar a aplicação. O Maven inclui no classpath de test e runtime mas não no de compilação.

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.26</version>
    <scope>runtime</scope>
</dependency>
```

#### provided
Indica que você espera que o JDK ou um *container* provenha a implementação em runtime. Por exemplo, ao construir um aplicativo da web JEE, você configuraria a dependência da API Servlet e APIs Java EE relacionadas para o escopo fornecido porque o contêiner da web fornece essas classes. Uma dependência com esse escopo é adicionada ao `classpath` usado para compilação e teste, mas não ao classpath do tempo de execução. Não é transitivo.

```xml
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
    <scope>provided</scope>
</dependency>
```

#### system

Escopo muito similar ao `provided`. Porém, ao invés de aguardar por uma implementação, nesse caso inferimos a localização do JAR para aquela dependência.

```xml
<dependency>
    <groupId>com.sshx</groupId>
    <artifactId>sshx</artifactId>
    <version>1.0</version>
    <scope>system</scope>
    <systemPath>${basedir}/lib/sshxcute-1.0.jar</systemPath>
</dependency>
```
