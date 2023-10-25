package service;

import entities.Contrato; // Importa a classe Contrato
import java.util.List;

public interface IContratoService {
    public String salvar(); // Declaração do método salvar

    public Contrato buscar(Long id); // Declaração do método buscar

    void excluir(Long id); // Declaração do método excluir

    List<Contrato> todosContratos(); // Declaração do método todosContratos

    Contrato atualizarContrato(long id, String nomeCliente, int anoDeValidade); // Declaração do método atualizarContrato

    //TODO
    // fazer métodos de
    // atualizar.
}