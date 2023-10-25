package entities;

public class Contrato {

    private String nomeCliente; // Atributo para armazenar o nome do cliente
    private Integer anoDeValidade; // Atributo para armazenar o ano de validade do contrato
    private Long id; // Atributo para armazenar o ID do contrato

    public String getNomeCliente() {
        return nomeCliente; // Retorna o nome do cliente
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente; // Define o nome do cliente
    }

    public Integer getAnoDeValidade() {
        return anoDeValidade; // Retorna o ano de validade do contrato
    }

    public void setAnoDeValidade(Integer anoDeValidade) {
        this.anoDeValidade = anoDeValidade; // Define o ano de validade do contrato
    }

    public Contrato(String nomeCliente, Integer anoDeValidade, Long id) {
        this.nomeCliente = nomeCliente; // Inicializa o nome do cliente com o valor fornecido
        this.anoDeValidade = anoDeValidade; // Inicializa o ano de validade do contrato com o valor fornecido
        this.id = id; // Inicializa o ID do contrato com o valor fornecido
    }

    public Long getId() {
        return id; // Retorna o ID do contrato
    }

    public void setId(Long id) {
        this.id = id; // Define o ID do contrato
    }
}