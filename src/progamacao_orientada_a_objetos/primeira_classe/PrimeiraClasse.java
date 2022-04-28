package progamacao_orientada_a_objetos.primeira_classe;

public class PrimeiraClasse {
    public static void main(String[] args) {
    Produto apple = new Produto();
    apple.nome = "Iphone 13 Pro Max";
    apple.precoUnitario = 10000.0;
    apple.quantidade = 15;
     exibirQuantidadeEmEstoque (apple);
    }
    static void exibirQuantidadeEmEstoque (Produto produto) {
        System.out.println("Quantidade em estoque do produto " + produto.nome
                + " é de " + produto.quantidade);
    }
}
