# API CRUD - PLATAFORMA DE CURSOS

## Uma API para gerenciar cursos de uma plataforma web 

Projeto desenvolvido como resultado do curso JAVA WEEK - Linux TIPS.
Esta API RESTfull foi desenvolvida usando a linguagem JAVA, além de tecnologias como o framework Spring Boot.
Foi utilizado também: 
- H2 Database: como banco de dados relacional;
- Spring DATA JPA: para facilitar acesso ao banco.
- Spring WEB: para aplicação web;
- Postman: como ferramenta de teste das chamadas da API;
- IDE Intellij Community.

### Conceitos Estudados
- CRUD: operacoes basicas que se pode performar em cima de dados, como criar um dado no bd, listar, buscar, atualizar e excluir.
  Create, read, update e delete

- API: (*Application Programming Interface*)conjunto de caracteristicas e regras existentes que possibilitam interaçoes com uma aplicaçao atraves de um software. Também é entendido como um contrato entre aplicações, onde uma fornece dados e recebe de outras aplicaçoes. Ela possui métodos padroes como get, post, que devem ser utilizado e respeitados para essa comunicação.
- CONSUMIR API: O termo consumir uma API é basicamente chamar uma url/uri/end point para voce enviar uma informacao ou receber, ex um get numa API publica.
 
- REST: (Representational State Transfer) conjunto de regras e restrições que deternima o que uma API deve conter para ser considerada RESTful.
- CODIGOS DE RESPOSTA HTTP: quando voce executa os metodos CRUD, eles tem uma serie de respostas possíveis. Onde ajuda a entender a situação de erro ou sucesso da chamada do metodo. Exemplo:  erro 200 sucesso, 404 error. Confira do site http.cat

### Como rodar a aplicação?
1. Instale o java da maneira que preferir: sdk install java 19.0.2-open.

2. Consulte o pom.xml do projeto para demais dependências. Baixe-as e configure.

3. Rode o comando mvn clean e mvn install

4. Rode o comando mvn spring-boot:run

DICA:  Abra o projeto na ide Intellij e Instale as dependencias da aplicação, como maven, hs, jpa, spring web. Lembre-se que a IDE possui um atalho na aba lateral para instalação de dependencias, basta ir em Maven>Lifecycle>clean, dê um clean-all caso não rode por falta de dependencias e ele vai reinstalar.

### Testando e acessando o Banco de Dados

1. Rode a aplicação e espere a mensagem no console

```bash
: Tomcat started on port 8080 (http) with context path '/'
: Started PlataformaDeEnsinoApiApplication 
```

2. Com a ferramenta Postman aberta, dê um post com sua URL e veja a respota HTTP:
    - `http://localhost:8080/api/cursos`   (sua URL do post)

      Passando o seguinte `BODY` em `JSON` com seus campos do pacote model:
      Exemplo de POST: Passando o seguinte BODY  na opção raw, em tipo JSON com seus campos do pacote model:
        ```json
        {
            "nome": "java week 2",
            "preco": 0,
            "pessoaInstrutora": "kamila"
        }
        ```

2. Acesse o console do H2 (http://localhost:8080/h2-console), no console copie as informações (ex:nome ta tabela) para acessar o console no navegador e dê um SELECT * FROM CURSO para ver se os dados estão no banco.
```bash
: H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:cursos'
: Tomcat started on port 8080 (http) with context path '/'
```


Autora: Karoene Mendonça
