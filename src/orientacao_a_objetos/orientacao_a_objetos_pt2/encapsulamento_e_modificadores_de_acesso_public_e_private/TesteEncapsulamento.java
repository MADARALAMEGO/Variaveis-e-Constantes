package orientacao_a_objetos.orientacao_a_objetos_pt2.encapsulamento_e_modificadores_de_acesso_public_e_private;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.trocarTemperatura(21);
        System.out.println("Temperatura do ar: "+ ar.obterTemperatura() + "°C");
    }
}