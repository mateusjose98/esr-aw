# Especialista Spring Rest - Alga Works Treinamentos

Este treinamento tem como objetivo ensinar a modelagem e criação de Web APIs REST.

## Modelo de Domínio:

![alt text](https://assets.algaworks.com/portal/content/especialista-spring-rest/images/diagrama-de-classes-de-dominio.jpg)


## Constraints do REST:

	- Aplicações independentes Cliente/Servidor
	- Stateless: a aplicação não deve possuir estado. Uma req. feita ao servidor deve ter tudo que é necessário para fazera operação.
	- Cache: a aplicação pode cachear as requisições que não mudam com frequência (podemos ter um servidor proxy para tal).
	- Interface uniforme: conjunto de operações BEM definidas no sistema. Usamos URIs em cima do protocolo HTTP neste caso.
	- Sistema em camadas
	- Código sob demanda
	
OBS.: Restful é um sistema/API que usa as constraints do REST.

## Recursos REST

	- É qualquer coisa exposta na Web, como um documento, uma foto, um pdf, etc. Tem importância suficiente para ser algo representado no software.
	- É como uma "instância de uma classe"
	- Singleton Resource (recurso único) x Collection Resource (coleções de objetos semelhantes)


## Modelo de maturidade de Richardson:

![alt text](https://martinfowler.com/articles/images/richardsonMaturityModel/overview.png)
