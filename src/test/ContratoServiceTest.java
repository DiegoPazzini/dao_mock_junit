package test;

import dao.ContratoDAO;
import dao.ContratoDAOMock;
import entities.Contrato;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IContratoService;

import java.util.List;

public class ContratoServiceTest {

    @Test
    public void salvarTeste() {
        IContratoService service = new ContratoService(new ContratoDAOMock()); // Cria uma instância de ContratoService com ContratoDAOMock
        String res = service.salvar(); // Chama o método salvar do serviço
        Assert.assertEquals("Sucesso", res); // Verifica se o resultado é "Sucesso"
    }

    @Test(expected = UnsupportedOperationException.class)
    public void salvarTesteExpectedUnsupportedOperationException() {
        IContratoService service = new ContratoService(new ContratoDAO()); // Cria uma instância de ContratoService com ContratoDAO
        String res = service.salvar(); // Chama o método salvar do serviço, que deve lançar uma exceção
    }

    @Test
    public void buscarTeste() {
        IContratoService service = new ContratoService(new ContratoDAOMock()); // Cria uma instância de ContratoService com ContratoDAOMock
        Contrato contrato = service.buscar(1L); // Chama o método buscar do serviço
        Contrato contratoT = new Contrato("Rafael", 2023, 1L); // Cria um contrato de teste
        Assert.assertEquals(contratoT.getNomeCliente(), contrato.getNomeCliente()); // Verifica se o nome do cliente é igual ao do contrato de teste
        Assert.assertEquals(contratoT.getAnoDeValidade(), contrato.getAnoDeValidade()); // Verifica se o ano de validade é igual ao do contrato de teste
        Assert.assertEquals(contratoT.getId(), contrato.getId()); // Verifica se o ID é igual
    }
}

//assertEquals: verifica se dois valores são iguais.
// assert é uma função do framework JUnit que permite verificar se uma determinada condição é verdadeira durante a execução dos testes. Ele é usado para realizar asserções, ou seja, verificar se o resultado obtido é o esperado.
//No código fornecido, o "t" em "contratoT" é uma convenção de nomenclatura comumente usada para indicar que se trata de um objeto de teste. O "t" pode ser entendido como uma abreviação de "test" ou "teste".