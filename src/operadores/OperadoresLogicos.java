package operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean carrinhoMaiorQue100 = false;
        boolean periodoDePromocao = true;
        boolean jaFezCompraNaLoja = false;
        boolean pagamentoAVista = true;
    //    boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
    //    boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
    //    boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
    //    boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
        boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
        if (aplicarDesconto) {
            System.out.println("Sim, aplique o desconto");
        } else {
            System.out.println("Não aplique o desconto");
        }
    }
}
