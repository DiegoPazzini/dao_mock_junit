package dao;

import entities.Contrato;
import java.util.List;
import java.util.stream.Collectors;

public class ContratoDAO implements IContratoDAO {
    private List<Contrato> todosContratos; // Declaração da lista de contratos

    @Override
    public List<Contrato> getTodosContratos() { // Implementação do método getTodosContratos
        return todosContratos; // Retorna a lista de contratos
    }

    @Override
    public void setTodosContratos(List<Contrato> todosContratos) { // Implementação do método setTodosContratos
        this.todosContratos = todosContratos; // Define a lista de contratos
    }

    @Override
    public String salvar() { // Implementação do método salvar
        throw new UnsupportedOperationException("Erro ao contactar banco de dados"); // Lança uma exceção indicando que houve um erro ao salvar no banco de dados
    }

    @Override
    public Contrato buscar(Long id) { // Implementação do método buscar
        throw new NullPointerException("Não foi possível encontrar um contrato com o ID fornecido"); // Lança uma exceção indicando que não foi possível encontrar um contrato com o ID fornecido
    }

    @Override
    public void excluir(Long id) { // Implementação do método excluir
        this.todosContratos = this.todosContratos.stream() // Filtra a lista de contratos
                .filter(contrato -> contrato.getId() != id) // Mantém apenas os contratos cujo ID é diferente do ID fornecido
                .collect(Collectors.toList()); // Converte o resultado para uma nova lista
    }

    @Override
    public Contrato atualizarContrato(Long id, String nomeCliente, Integer anoDeNascimento) { // Implementação do método atualizarContrato
        throw new NullPointerException("Não foi possível encontrar um contrato com o ID fornecido"); // Lança uma exceção indicando que não foi possível encontrar um contrato com o ID fornecido
    }
}