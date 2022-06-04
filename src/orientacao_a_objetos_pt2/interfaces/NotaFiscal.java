package orientacao_a_objetos_pt2.interfaces;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail{
    private int numero;

    public NotaFiscal(int numero) {
        this.numero = numero;
    }

    @Override
    public void enviar(String email) {
        System.out.println("Enviando a nota de número: " + numero + " para o email: " + email);
    }

    @Override
    public void imprimir() {
        System.out.println("Vamos imprimir essa nota fiscal de número: " + numero);

    }

    public void adicionarPedido(String produto) {
    }
}