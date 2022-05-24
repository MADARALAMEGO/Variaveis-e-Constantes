package orientacao_a_objetos_pt2.desafio04;

public class Principal {
    public static void main(String[] args) {
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");
        Cliente atacadista = new Cliente();
        atacadista.setNome("Triângulo Quadrado Atacadista");
        Cliente telecom = new Cliente();
        telecom.setNome("FoneNet Telecomunicações");
        ContaAPagar contaPagar1 = new ContaAPagar();
        contaPagar1.setDescricao("Aluguel da matriz");
        contaPagar1.setValor(1230d);
        contaPagar1.setDataDeVencimento("10/05/2012");
        contaPagar1.setFornecedor(imobiliaria);
        ContaAPagar contaPagar2 = new ContaAPagar(mercado, "Compras do mês", 390d, "19/05/2012");
        ContaReceber contaReceber1 = new ContaReceber();
        contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
        contaReceber1.setValor(89500d);
        contaReceber1.setDataDeVencimento("23/05/2012");
        contaReceber1.setCliente(atacadista);
        ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online",
                53200d, "13/05/2012");
        contaPagar1.pagar();
        contaPagar2.cancelar();
        contaReceber1.receber();
        contaReceber2.cancelar();
    }
}