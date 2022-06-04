package orientacao_a_objetos_pt2.desafio_interface;

public class Carro implements Seguravel{
    String descricao;
    @Override
    public void obterDescricao() {
        System.out.println("descricao: " + descricao);
    }

    @Override
    public void calcularValorApolice() {

    }
}
