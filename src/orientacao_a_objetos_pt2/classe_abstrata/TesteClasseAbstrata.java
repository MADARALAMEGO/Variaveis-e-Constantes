package orientacao_a_objetos_pt2.classe_abstrata;

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        Produto p = new ProdutoPericivel();
        p.descricao = "Caixa de Leite";
        ProdutoPericivel pp = (ProdutoPericivel) p;
        pp.dataValidade = "10/07/22";

    }
}