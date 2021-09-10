## Tipos de dependência
Quando você adiciona uma dependência ao projeto, está inserindo um recurso/biblioteca em sua aplicação. Muitas vezes uma lib para testar, um utilitário, framework. É comum que esses recursos também tenham suas próprias dependências. Por exemplo, veja este [link](https://repo1.maven.org/maven2/org/junit/jupiter/junit-jupiter-api/5.7.2/junit-jupiter-api-5.7.2.pom). Aqui podemos ver na tag `<dependencies>` as dependências deste componente do jUnit.

```xml
    <dependency>
        <groupId>org.apiguardian</groupId>
        <artifactId>apiguardian-api</artifactId>
        <version>1.1.0</version>
        <scope>compile</scope>
    </dependency>
    <dependency>
        <groupId>org.opentest4j</groupId>
        <artifactId>opentest4j</artifactId>
        <version>1.2.0</version>
        <scope>compile</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.platform</groupId>
        <artifactId>junit-platform-commons</artifactId>
        <version>1.7.2</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```
Assim, caso nesse cenário adicionássemos este componente do jUnit estaríamos adicionando dois tipos de dependência ao nosso projeto:
- **Dependência direta**: declarada no `pom.xml`
- **Dependência transitiva**: dependências do componente que seu projeto está utilizando

### Por que eu deveria me preocupar com as dependências transitivas ?

As dependências transitivas, ou seja, aquelas que os artefatos que você adicionou ao seu projeto utiliza estão disponíveis no seu classpath, em outras palavras, você consegue utilizar. Isso pode ao longo do tempo e com o crescimento da aplicação se tornar um problema. Pense nos cenários:
- Vamos supor que existem duas versões diferentes do mesmo componentes herdado, de forma transitiva ?
- Outro cenário que pode surgir é o time utilizar sem perceber e numa possível atualização da dependência ocorrer um problema de compatibilidade

Existem vários outros cenários, mas isso é para compreender o problema desta situação.
