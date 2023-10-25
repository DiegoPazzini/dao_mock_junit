# dao_mock_junit
Resumo do projeto:

Este projeto consiste em um sistema de gerenciamento de contratos, com classes relacionadas à persistência e manipulação de dados de contratos.

A classe Contrato representa um contrato e possui atributos como nome do cliente, ano de validade e ID do contrato. Ela também possui métodos getters e setters para acessar e definir os valores desses atributos.

A interface IContratoDAO define os métodos que devem ser implementados por qualquer classe que represente um DAO (Data Access Object) para contratos. Esses métodos incluem salvar, buscar, excluir e atualizar contrato.

A classe ContratoDAO é uma implementação real de IContratoDAO e é responsável por acessar e manipular os dados dos contratos em um banco de dados. Já a classe ContratoDAOMock é uma implementação de teste que utiliza uma lista de contratos em memória.

A classe ContratoService é responsável por fornecer serviços relacionados a contratos. Ela recebe uma instância de IContratoDAO no construtor e utiliza esse DAO para realizar as operações de persistência e manipulação de contratos.

O projeto também inclui uma classe de teste ContratoServiceTest, que utiliza o framework JUnit para testar os métodos da classe ContratoService. Os testes incluem verificar se o método de salvar retorna o resultado esperado, se o método de buscar retorna o contrato correto e se o método de salvar lança uma exceção quando utilizado com a implementação real do DAO.

Em resumo, este projeto implementa um sistema básico de gerenciamento de contratos, com classes para representar contratos, persistir e manipular os dados desses contratos, e serviços para fornecer funcionalidades relacionadas a contratos. Os testes garantem o correto funcionamento dos métodos implementados.

## Skills utilizadas:
<div style="display: inline_block"><br>
   <img align="center" alt="Spring" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
  <img align="center" alt="Spring" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
