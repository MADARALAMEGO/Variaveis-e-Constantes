package orientacao_a_objetos.orientacao_a_objetos_pt2.modificador_de_acesso_default;

public class Cachorro {
    String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void sentar() {
        System.out.println("Eu, "+ nome + "vou sentar");
    }
}
