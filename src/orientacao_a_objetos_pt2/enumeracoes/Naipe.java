package orientacao_a_objetos_pt2.enumeracoes;

public class Naipe {
    private int numero;
    private Naipe naipe;
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }
    public void imprimirCarta() {
        System.out.println("Sou " + numero + " de " + naipe +
                ". E tenho a cor " + naipe.getCor());
    }
}
