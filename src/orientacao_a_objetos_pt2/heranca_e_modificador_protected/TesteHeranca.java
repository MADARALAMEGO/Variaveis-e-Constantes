package orientacao_a_objetos_pt2.heranca_e_modificador_protected;

public class TesteHeranca {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        j.nome = "CRISTIANO RONALDO";
        j.idade = 37;
        j.seApresentar();
        j.dizerSeAindaJoga();
    }
}