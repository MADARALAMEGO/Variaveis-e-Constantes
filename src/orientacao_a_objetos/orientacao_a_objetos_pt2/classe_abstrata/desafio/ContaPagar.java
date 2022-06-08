package orientacao_a_objetos.orientacao_a_objetos_pt2.classe_abstrata.desafio;

public class ContaPagar extends Conta {

        private Fornecedor fornecedor;

    public ContaPagar() {
        }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
            this.fornecedor = fornecedor;
            this.setDescricao(descricao);
            this.setValor(valor);
            this.setDataVencimento(dataVencimento);
        }

        public void exibirDetalhes () {
            System.out.println("\nConta a Pagar");
            System.out.println("================================");
            System.out.println("Fornecedor: " + this.getFornecedor().getNome());
            System.out.println("Descrição: " + this.getDescricao());
            System.out.println("Valor: " + this.getValor());
            System.out.println("Data de vencimento: " + this.getDataVencimento());
            System.out.println("Situação: " + this.getSituacaoConta());
            System.out.println("=================================");
        }

        public void pagar () {
            if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
                System.out.println("Não pode pagar uma conta que já está paga: "
                        + this.getDescricao() + ".");
            } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
                System.out.println("Não pode pagar uma conta que está cancelada: "
                        + this.getDescricao() + ".");
            } else {
                System.out.println("Pagando conta " + this.getDescricao() + " no valor de "
                        + this.getValor() + " e vencimento em " + this.getDataVencimento()
                        + " do fornecedor " + this.getFornecedor().getNome() + ".");
                this.situacaoConta = SituacaoConta.PAGA;
            }
        }

        public Fornecedor getFornecedor () {
            return fornecedor;
        }

        public void setFornecedor (Fornecedor fornecedor){
            this.fornecedor = fornecedor;
        }
    }