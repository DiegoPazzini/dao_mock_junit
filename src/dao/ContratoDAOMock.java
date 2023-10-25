package dao;

import entities.Contrato;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ContratoDAOMock implements IContratoDAO {
    private List<Contrato> todosContratos;

    public ContratoDAOMock() {
        // Inicializa a lista de contratos com alguns contratos de exemplo
        this.todosContratos = List.of(
                new Contrato("Rafael", 2023, 1L),
                new Contrato("Andre", 2024, 2L),
                new Contrato("Andre", 2024, 3L)
        );
    }

    @Override
    public List<Contrato> getTodosContratos() {
        // Retorna a lista de todos os contratos
        return this.todosContratos;
    }

    @Override
    public void setTodosContratos(List<Contrato> todosContratos) {
        // Define a lista de todos os contratos
        this.todosContratos = todosContratos;
    }

    @Override
    public String salvar() {
        // Simula um método de salvar e retorna uma mensagem de sucesso
        return "Sucesso";
    }

    @Override
    public Contrato buscar(Long id) {
        // Retorna um contrato de exemplo com ID 1
        return new Contrato("Rafael", 2023, 1L);
    }

    @Override
    public void excluir(Long id) {
        // Filtra a lista de contratos mantendo apenas os contratos cujo ID é diferente do ID fornecido
        this.todosContratos = this.todosContratos.stream()
                .filter(contrato -> contrato.getId() != id)
                .collect(Collectors.toList());
    }

    @Override
    public Contrato atualizarContrato(Long id, String nomeCliente, Integer anoDeValidade) {
        // Variável para armazenar o contrato atualizado
        final Contrato[] contratoAtualizado = new Contrato[1];

        // Mapeia cada contrato da lista
        this.todosContratos = this.todosContratos.stream()
                .map(contrato -> {
                    // Verifica se o ID do contrato é igual ao ID fornecido
                    if (contrato.getId().equals(id)) {
                        // Atualiza o nome do cliente e o ano de validade do contrato
                        contrato.setAnoDeValidade(anoDeValidade);
                        contrato.setNomeCliente(nomeCliente);
                        contratoAtualizado[0] = contrato; // Armazena o contrato atualizado na variável contratoAtualizado
                    }
                    return contrato; // Retorna o contrato
                })
                .collect(Collectors.toList()); // Coleta os contratos em uma nova lista

        return contratoAtualizado[0]; // Retorna o contrato atualizado
    }
}