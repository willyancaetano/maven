## Criando projetos pela linha de comando

Podemos criar projetos maven utilizando a linha de comando, exemplo:

    mvn archetype:generate -DgroupId=one.digitalinnovation -DartifactId=maven-quickstart -Darchetype=maven-archetype-quickstart -DinteractiveMode=false

Aqui utilizamos o conceito de archetypes, que nada mais é que templates prontos para gerar projetos com uma determinada configuração para atender uma necessidade. Assim, não precisamos "criar tudo do zero". Procure na internet por "Maven archetypes list" e encontrará diversos tipos de projeto prontos para criar. Nas referências temos várias listas.
