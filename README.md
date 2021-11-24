# microservice---usuarios
Este projeto é um microservice simples desenvolvido com a tecnologia Spring Boot utilizando Maven e API Rest, onde é possível cadastrar os usuários que serão os donos das carteiras a serem utilizadas pelos outros serviços.

Obs: Este projeto só faz sentido executando juntamente com os outros 4 serviços
   - [Carteira](https://github.com/GustavoCSchmitz/microservice---carteira)
   - [Saque,depósito e transferência](https://github.com/GustavoCSchmitz/microservice---saqueDeposito)
   - [Eureka Server](https://github.com/GustavoCSchmitz/microservice---eureka)
   - [Pagamento](https://github.com/GustavoCSchmitz/microservice---pagamentos)


### Requisitos de API e instruções para execução
 - Java 8
 - Maven 3 para construir o aplicativo.
 - Abrir na pasta raíz do projeto e executar o comando:
 
      `mvn clean install`
 - Após a instalação, subir o projeto com o comando:
       
      `mvn spring-boot:run`
      
### API endpoint
  - Método: POST
     - Cadastrar usuário
        - [http://localhost:8083/cadastrar]()
        - Deve ser inserido um json, semelhante ao exemplo abaixo:
        ```
        {
            "saldoInicial": 1550.0,
            "nome": "Teste"
        }
        ```
        - Todos os campos são obrigatórios

 
