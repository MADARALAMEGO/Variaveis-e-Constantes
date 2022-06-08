package orientacao_a_objetos.orientacao_a_objetos_pt2.desafio_interface;

public class Imovel implements Seguravel{
    private double valorMercado;
    private int areaConstruida;

    public Imovel(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    @Override
    public String obterDescricao() {
        return "Area imóvel: "+ this.areaConstruida + "m² \n" +
                "Valor de mercado: " + this.valorMercado;
    }

    @Override
    public double calcularValorApolice() {
     double valorApolice = valorMercado * 0.003;
     valorApolice = valorApolice + (areaConstruida * 0.5);
        return valorApolice;
    }
}