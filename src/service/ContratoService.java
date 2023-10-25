package service;

import dao.IContratoDAO;
import entities.Contrato;

import java.util.List;

public class ContratoService implements IContratoService {
    private IContratoDAO contratoDAO; // Atributo para armazenar o DAO de Contrato

    public ContratoService(IContratoDAO contratoDAO) {
        this.contratoDAO = contratoDAO; // Construtor que recebe o DAO de Contrato como parâmetro
    }

    public IContratoDAO getContratoDAO() {
        return contratoDAO; // Retorna o DAO de Contrato
    }

    public void setContratoDAO(IContratoDAO contratoDAO) {
        this.contratoDAO = contratoDAO; // Define o DAO de Contrato
    }

    @Override
    public String salvar() {
        return this.contratoDAO.salvar(); // Chama o método salvar do DAO de Contrato
    }

    @Override
    public Contrato buscar(Long id) {
        return this.contratoDAO.buscar(id); // Chama o método buscar do DAO de Contrato
    }

    @Override
    public List<Contrato> todosContratos() {
        return this.contratoDAO.getTodosContratos(); // Chama o método getTodosContratos do DAO de Contrato
    }

    @Override
    public Contrato atualizarContrato(long id, String nomeCliente, int anoDeValidade) {
        return this.contratoDAO.atualizarContrato(id, nomeCliente, anoDeValidade); // Chama o método atualizarContrato do DAO de Contrato
    }

    @Override
    public void excluir(Long id) {
        this.contratoDAO.excluir(id); // Chama o método excluir do DAO de Contrato
    }
}