package orientacao_a_objetos.orientacao_a_objetos_pt2.exercicio_sobrecarga;

public class TesteMaquinaCafe {
    public static void main(String[] args) {
        MaquinaCafe maquinaCafe = new MaquinaCafe();
        maquinaCafe.acucarDisponivel = 30;
        maquinaCafe.fazerCafe(10);
        maquinaCafe.fazerCafe(15);
        maquinaCafe.fazerCafe();
    }
}
