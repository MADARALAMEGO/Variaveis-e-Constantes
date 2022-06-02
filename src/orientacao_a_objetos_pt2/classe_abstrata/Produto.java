package orientacao_a_objetos_pt2.classe_abstrata;

public abstract class Produto {
    String descricao;
    public abstract void imprimirDescricao();
    public String getDescricao() {
        return descricao;
    }
}
