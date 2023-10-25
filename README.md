# dao_mock_junit

Este conjunto de códigos representa um projeto simplificado de exemplo que ilustra o uso de interfaces e classes em um sistema fictício de gerenciamento de clientes e contratos. A estrutura do projeto é dividida em pacotes que organizam as classes de acordo com suas responsabilidades. Vamos analisar cada parte:
ClienteService (no pacote com.pazzini.service): Esta classe representa um serviço que opera sobre uma entidade de cliente. Ela é responsável por interagir com um objeto IClienteDao para realizar operações de salvar clientes no sistema.
ContratoService (no pacote com.pazzini.service): Similar à classe ClienteService, esta classe lida com operações de contrato e interage com a interface IContratoDao.
IContratoService e IContratoDao (no pacote com.pazzini.service e com.pazzini.dao, respectivamente): Essas interfaces definem os métodos esperados para serviços e DAOs (objetos de acesso a dados) relacionados a contratos.
Cliente e TesteCliente (no pacote com.pazzini): Essas classes são estruturas simples que representam clientes e informações de teste relacionadas a clientes.
ClienteDao e ClienteDaoMock (no pacote com.pazzini.dao): Essas classes representam implementações de acesso a dados para entidades de cliente. O ClienteDao lança exceções, enquanto o ClienteDaoMock retorna null.
ContratoDao e ContratoDaoMock (no pacote com.pazzini.dao e com.pazzini.dao.mock, respectivamente): Semelhante ao ClienteDao, essas classes lidam com operações de acesso a dados para contratos. O ContratoDao lança exceções, enquanto o ContratoDaoMock possui métodos vazios.
Este projeto é uma simulação de um sistema de gerenciamento de clientes e contratos, onde as classes de serviço interagem com as classes de acesso a dados (DAOs) por meio de interfaces. A separação em interfaces e implementações permite a fácil substituição de implementações reais por mocks ou outras implementações para fins de testes e simulações.

## Skills utilizadas:
<div style="display: inline_block"><br>
   <img align="center" alt="Spring" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg">
  <img align="center" alt="Spring" height="60" width="60" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
