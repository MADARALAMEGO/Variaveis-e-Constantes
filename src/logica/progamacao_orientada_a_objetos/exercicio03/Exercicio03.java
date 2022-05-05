package logica.progamacao_orientada_a_objetos.exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.codigo = 12345;
        pedido.subtotal = 3000.0;
        pedido.desconto = 10.0;
        System.out.println(" Código: " + pedido.getCodigo());
        System.out.println (" Subtotal: " + pedido.getSubtotal() + " R$");
        System.out.println(" Desconto: " + pedido.getDesconto() + " %");
        System.out.println(" Total: " + pedido.getTotal() + " R$");
        }
    }
