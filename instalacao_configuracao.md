## Como instalar/configurar o Maven

### Pré-requisito

 - Ter instalado uma versão do JDK. Se você usa Windows, siga [este tutorial](https://mauriciogeneroso.medium.com/configurando-java-1-instala%C3%A7%C3%A3o-do-jre-e-do-jdk-no-windows-38cacace0377). Se utiliza Linux, [este tutorial](https://digitalinnovation.one/artigos/como-instalar-o-java-com-o-apt-no-ubuntu-2004) apresenta como instalar no Ubuntu.

### Configurando no Windows

 - Baixe o [pacote](https://maven.apache.org/download.cgi) do Maven
 - Acesso o Painel de Controle
 - Procure pelas opções e navegue: Sistema e Segurança > Sistema > Configurações avançadas do sistema > Avançado > Variáveis de ambiente
 - Procure por "Variáveis de Sistema"
 - Procure pela variável "Path"
 - Adicione na mesma o caminho do diretório onde se encontra o Maven, exemplo `C:\Users\seu_usuario\pasta_do_apache_maven\bin`

### Configurando no Linux
 - Baixe o [pacote](https://maven.apache.org/download.cgi) do Maven
 - Copie caminho do diretório onde se encontra o Maven, exemplo `/home/seu_usuario/pasta_do_apache_maven/bin`
 - Edite o arquivo `.bashrc` contido no diretório `/home/seu_usuario`
 - Adicione no fim do arquivo a seguinte linha 
 `export PATH=/home/seu_usuario/pasta_do_apache_maven/bin:$PATH`

 ### Para testar a instalação
 Execute no seu terminal

     mvn --version
