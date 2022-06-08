package orientacao_a_objetos.orientacao_a_objetos_pt2.desafio_interface;

public class CorretoraSeguros {
    public void fazerPropostaSeguro (Seguravel objetoSeguravel) {
        System.out.println("---------------------------------");
        System.out.println("Corretora de Seguros - Proposta");
        System.out.println("---------------------------------");
        System.out.println(objetoSeguravel.obterDescricao());
        System.out.println("Valor da Apólice: " + objetoSeguravel.calcularValorApolice());
        System.out.println("---------------------------------\n");
    }
}