package orientacao_a_objetos_pt2.desafio04;

public class ContaReceber extends Conta {
    public ContaReceber() {
    }
    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataDeVencimento) {
        this();
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }
    public void setCliente(Cliente cliente) {
    }
    public void cancelar() {
        if (valor > 50000) {
            System.err.println("Não pode cancelar " + this.getDescricao() + " pois seu valor é maior que R$ 50.000.");
        } else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.err.println("A conta " + this.getDescricao() + " já foi cancelada anteriormente.");
        } else if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.err.println("A conta " + this.getDescricao() + " já foi devidamente paga.");
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }
    public void receber() {
        if(SituacaoConta.PENDENTE.equals(this.getSituacaoConta())) {
            System.out.println("Conta " + this.getDescricao() + " paga com sucesso.");
        }

    }
}