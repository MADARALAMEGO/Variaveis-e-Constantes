package orientacao_a_objetos_pt2.desafio04;

public class ContaReceber extends Conta {
    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataDeVencimento) {
        this();
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }
}
