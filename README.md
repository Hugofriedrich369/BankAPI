# 🏦 | BankAPI

## ❔ | Como utilizar?
Para rodar a aplicação é necessário utilizar o maven: 

~~~mvn
./mvnw compile quarkus:dev
~~~

Ou

~~~command prompt
quarkus dev
~~~

A aplicação será iniciada em http://localhost:8080

## ⚙️ | Endpoints

> Endpoint principal: /contacorrente
> 
> OBS: Os parâmetros dos posts e patch são passados pelo formato x-www-form-urlencoded

 Metódo |       Endpoint       |                           Explicação                           |                              Paramêtros                              
:-------:|:--------------------:|:--------------------------------------------------------------:|:--------------------------------------------------------------------:
 GET    |    /listarContas     |                 Listar todas contas correntes                  |
 GET    | /saldo/{numeroConta} |                Ver saldo de uma conta corrente                 |
 POST   |                      |                    Criar uma conta corrente                    |                            nome <br> cpf                             
 POST   |      /depositar      |           Depositar uma certa quantia para uma conta           |                        numeroConta <br> valor                        
 POST   |        /sacar        |                 Sacar uma quantidade da conta                  |                        numeroConta <br> valor                        
 PATCH  |     /transferir      | transferir uma quantidade da conta origem para a conta destino | contaOrigem (numero da conta) <br> contaDestino (numero da conta) <br> valor 
