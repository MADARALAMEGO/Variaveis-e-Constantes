package orientacao_a_objetos.orientacao_a_objetos_pt2.o_objeto_this;

public class Carro<Proprietario> {
    String fabricante;
    String modelo;
    String  cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    Proprietario dono;
    void alterarModelo(String modelo, Carro carro){
        if (modelo != null) {
            carro.modelo = modelo;
        }
    }

    void ligar() {
        if (modelo != null) {
            System.out.println("ligando o carro: " + modelo);
        }
    }
}
