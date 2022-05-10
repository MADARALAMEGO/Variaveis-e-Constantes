package orientacao_a_objetos_pt2.construtores;

public class TesteConstrutor {
    public static void main(String[] args) {
     Pessoa p1 = new Pessoa("João", 22);
        System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos" );
    }
}
