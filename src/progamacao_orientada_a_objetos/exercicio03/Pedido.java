package progamacao_orientada_a_objetos.exercicio03;

public class Pedido {
    Integer codigo;
    Double subtotal;
    Double desconto;
    Double getTotal() {
        return subtotal - desconto;
    }
    void setTotal(Double total) {
    }
    Integer getCodigo() {
        return codigo;
    }
    void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    Double getSubtotal() {
        return subtotal;
    }
    void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    Double getDesconto() {
        return desconto;
    }
    void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
