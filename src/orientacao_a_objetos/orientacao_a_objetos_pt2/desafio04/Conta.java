package orientacao_a_objetos.orientacao_a_objetos_pt2.desafio04;

public class Conta {
    protected SituacaoConta situacaoConta;
    String descricao;
    Double valor;
    String dataDeVencimento;
    Fornecedor fornecedor;

    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    }
    public Conta(String descricao, Double valor, String dataDeVencimento) {
        this();
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }
    public void cancelar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi paga. " + this.getDescricao() + ".");
        }else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Nâo pode cancelar uma conta que já foi cancelada. " + this.getDescricao() + ".");
        }
        else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public void setSituacaoConta(SituacaoConta situacaoConta) {
        this.situacaoConta = situacaoConta;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public Double getValor() {
        return valor;
    }
    public String getDataDeVencimento() {
        return dataDeVencimento;
    }
    public String getDescricao() {
        return descricao;
    }
    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

}
