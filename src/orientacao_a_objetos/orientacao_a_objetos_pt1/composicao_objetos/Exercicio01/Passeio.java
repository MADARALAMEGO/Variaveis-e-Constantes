package orientacao_a_objetos.orientacao_a_objetos_pt1.composicao_objetos.Exercicio01;

public class Passeio {
    public static void main(String[] args) {
       Dono dono = new Dono();
       dono.nome = "Cleiton";
       dono.cachorro = new Cachorro();

       dono.cachorro.nome = "Poseidon";
       dono.cachorro.idade = 1;
       dono.cachorro.sexo = 'm';
       dono.cachorro.raca = "Husk Siberiano";

    }
}
