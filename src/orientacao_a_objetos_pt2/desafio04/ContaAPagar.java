package orientacao_a_objetos_pt2.desafio04;

public class ContaAPagar extends Conta {

    public ContaAPagar() {
    }
    public ContaAPagar(Fornecedor fornecedor, String descricao, Double valor, String dataDeVencimento) {
        this();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }
    public void pagar() {
        if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que já está paga. " + this.getDescricao() + ".");
        }else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que foi cancelada. " + this.getDescricao() + ".");
        }else {
            System.out.println(fornecedor.getNome() + ": " + getDescricao() + "\n" + getDataDeVencimento() + "\nR$ " + getValor() + "\n");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }


}