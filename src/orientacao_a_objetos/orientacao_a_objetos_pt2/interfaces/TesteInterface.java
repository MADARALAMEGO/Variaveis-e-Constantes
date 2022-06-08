package orientacao_a_objetos.orientacao_a_objetos_pt2.interfaces;

public class TesteInterface {
    public static void main(String[] args) {
        Imprimivel i = new NotaFiscal(1234);
        i.imprimir();
        EnviavelPorEmail e = (EnviavelPorEmail) i;
        e.enviar("filipealvesvaz@gmail.com");
        NotaFiscal n = (NotaFiscal) e;
        n.adicionarPedido("caixa de leite");
    }
}
