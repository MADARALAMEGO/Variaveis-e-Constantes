package orientacao_a_objetos.orientacao_a_objetos_pt2.heranca_e_modificador_protected;

public class Pessoa {
    String nome;
    protected int idade;
    public void seApresentar(){
        System.out.println("Olá eu sou o "+nome+
                " e tenho "+idade+" anos.");
    }
}
