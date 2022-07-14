# lab-padroes-projeto-spring
Projeto feito durante as aulas de Design Patterns (Padrões de Projeto) com Spring no Bootcamp da TQI, na DIO.
No Spring, podemos ver como é rápido criar CRUDs e implementar uma API Rest nesse ecossistema graças aos starters Spring.

## Sobre cada padrão
- [**Padrão Singleton**](https://github.com/DaveJosef/lab-padroes-projeto-spring/tree/master/src/main/java/one/digitalinnovation/gof/service/impl):
Neste padrão se implementa uma classe com construtor privado e um método getter que devolve uma instância única (por isso o nome single-ton) e igual para cada vez que esse método for chamado;
- [**Padrão Strategy**](https://github.com/DaveJosef/lab-padroes-projeto-spring/tree/master/src/main/java/one/digitalinnovation/gof/service):
Consiste em definir a assinatura de métodos em uma interface para suas futuras implementações seguirem essa espécie de contrato de implementação;
- [**Padrão Facade**](https://github.com/DaveJosef/lab-padroes-projeto-spring/tree/master/src/main/java/one/digitalinnovation/gof/controller):
É um padrão caracterizado pela disponibilização de classes de serviços que disponibilizam métodos responsáveis por abstrair toda a camada lógica da aplicação;

## Eu adicionei
Eu expandi o projeto ao adicionar um CRUD de compras, dessa forma a API poderá ter uma ou vária compras associadas a um cliente.

Sintam-se livres para dar feedback e/ou contribuir.
