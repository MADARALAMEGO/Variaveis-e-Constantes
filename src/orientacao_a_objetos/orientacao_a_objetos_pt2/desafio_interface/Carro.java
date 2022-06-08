package orientacao_a_objetos.orientacao_a_objetos_pt2.desafio_interface;

public class Carro implements Seguravel{

    private double valorMercado;
    private int anoFabricacao;

    public Carro(double valorMercado, int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;
    }

    @Override
    public String obterDescricao() {
        return "Ano de fabricação: " + this.anoFabricacao +
                "\nValor de Mercado: " + this.valorMercado ;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valorMercado * 0.04;
        if (anoFabricacao < 2000){
            valorApolice = valorApolice * 0.9;
        }
        return valorApolice;
    }
}