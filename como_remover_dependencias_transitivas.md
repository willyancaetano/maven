## Gerenciando dependências

## Como remover dependências transitivas

### Excluindo no pom

Para remover uma dependência transitiva você pode utilizar a tag `<exclusions>`, dentro da declaração da dependência.

```xml
      <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-beans</artifactId>
        <exclusions>
          <exclusion>
            <groupId>commons-logging</groupId>
            <artifactId>commons-logging</artifactId>
          </exclusion>
        </exclusions>
      </dependency>
```
