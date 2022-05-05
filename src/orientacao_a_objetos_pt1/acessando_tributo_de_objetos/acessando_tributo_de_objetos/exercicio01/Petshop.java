package orientacao_a_objetos_pt1.acessando_tributo_de_objetos.acessando_tributo_de_objetos.exercicio01;

public class Petshop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Cronos";
        cachorro.idade = 1;
        cachorro.raca = "Husk Siberiano";
        cachorro.sexo = 'M';

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Artemis";
        cachorro2.idade = 1;
        cachorro2.raca = "Husk Siberiano";
        cachorro2.sexo = 'F';

        System.out.println("Nome: " + cachorro.nome);
        System.out.println("--------------------------");
        System.out.println("Idade: " + cachorro.idade );
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Sexo: " + cachorro.sexo);

        System.out.println();
        System.out.println("Nome: " + cachorro2.nome);
        System.out.println("---------------------------");
        System.out.println("Idade: " + cachorro2.idade );
        System.out.println("Raça: " + cachorro2.raca);
        System.out.println("Sexo: " + cachorro2.sexo);

    }
}
