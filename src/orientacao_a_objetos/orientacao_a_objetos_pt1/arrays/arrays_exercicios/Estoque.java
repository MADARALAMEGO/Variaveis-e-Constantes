package orientacao_a_objetos.orientacao_a_objetos_pt1.arrays.arrays_exercicios;

public class Estoque {
    Produto[] produtos;
    void listarProdutos() {
        System.out.println("\nProdutos em estoque");
        System.out.println("---------------------");
        for (int i = 0 ; i < produtos.length; i++){
            produtos[i].descrever();
        }
    }
}
