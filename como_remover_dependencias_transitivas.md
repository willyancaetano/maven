## Gerenciando dependências

## Como remover dependências transitivas

### Excluindo no pom

Para remover uma dependência transitiva você pode utilizar a tag `<exclusions>`, dentro da declaração da dependência.

```xml
      <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-beans</artifactId>
        <version>5.0.0</version>
        <exclusions>
          <exclusion>
            <groupId>commons-logging</groupId>
            <artifactId>commons-logging</artifactId>
          </exclusion>
        </exclusions>
      </dependency>
```

### Dependências opcionais

Para evitar que as dependências que sua aplicação utiliza sejam propagadas como dependências transitivas você pode declarar como dependência opcional, usando a tag `<optional>`:

```xml
      <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-beans</artifactId>
        <version>5.0.0</version>
        <optional>true</optional>
      </dependency>
```

Dessa forma, a dependência não é propagada para os usuários da sua biblioteca.
