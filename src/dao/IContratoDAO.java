package dao;

import entities.Contrato;

import java.util.List;

public interface IContratoDAO {
    List<Contrato> getTodosContratos(); // Método para obter todos os contratos

    void setTodosContratos(List<Contrato> todosContratos); // Método para definir todos os contratos

    public String salvar(); // Método para salvar

    public Contrato buscar(Long id); // Método para buscar um contrato pelo ID

    void excluir(Long id); // Método para excluir um contrato pelo ID

    Contrato atualizarContrato(Long id, String nomeCliente, Integer anoDeValidade); // Método para atualizar um contrato com base no ID, nome do cliente e ano de validade

    //TODO
    // fazer métodos de
    // atualizar.
}