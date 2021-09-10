## Principais comandos utilizados no dia a dia

    mvn compile
Este comando compila seu código Java e cria uma pasta target com os arquivos `.class`

    mvn test
Este comando executa as classes de teste do seu projeto e aponta 

    mvn package
Este comando empacota seu código Java gerando arquivos `.jar`, `.ear` ou `.war` (varia conforme [estratégia de empacotamento](https://maven.apache.org/archetype/archetype-packaging/))

    mvn clean
Remove a pasta `target` criada para gerar os arquivos compilados e o pacote.

    mvn install
Publica o artefato do projeto no repositório local

    mvn dependency:tree
Analisa a árvore de dependências do projeto, mostrando as diretas e transitivas.
