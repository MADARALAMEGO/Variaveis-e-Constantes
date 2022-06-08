package orientacao_a_objetos.orientacao_a_objetos_pt1.arrays.trabalhando_com_arrays;

public class Carro<Proprietario> {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;

    Proprietario dono;

    void ligar() {
        if (modelo != null) {
            System.out.println("Ligando o carro: " + modelo);
        }
    }
}
