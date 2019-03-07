# Cucumber Com Selenium WebDriver
Selenium Webdriver + Cucumber + Screenshot + Relatório.

Comandos: OBS: PARA UTILIZAR OS COMANDOS, DEVE SER INSTALADO NO SEU COMPUTADOR O MAVEN. ESTOU UTILIZANDO O MAVEN 3.3.9
 
mvn test = Ao Rodar esse comando no Terminal todos os testes são executados.

mvn test -Dcucumber.options=“--tags @Case1” = Ao Rodar esse comando passando a tag específica de um cenário de testes, será executado somente o teste da tag específica.

mvn cluecumber-report:reporting = Ao Rodar esse comando é gerado o relatório dos últimos testes.

CUCUMBER_OPTIONS='--tags @Case1' mvn test = Se não funcionar o comando acima de tags com o cucumber, utilizar esse comando. 
Substituir o @Case1 pela tag que queira executar dos seus testes.

# Linux / OS X:
CUCUMBER_OPTIONS='--tags "@smoke and @fast"' mvn test

# Windows:
set CUCUMBER_OPTIONS='--tags "@smoke and @fast"'
mvn test


PARA RODAR OS TESTES SEM INSTALAR O MAVEN É SÓ ACESSAR O ARQUIVO RunnerTest E CLICAR NA SETA DE RUN.


