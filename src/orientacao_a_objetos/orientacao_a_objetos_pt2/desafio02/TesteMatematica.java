package orientacao_a_objetos.orientacao_a_objetos_pt2.desafio02;

public class TesteMatematica {

    public static void main(String[] args) {
        int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
        System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);
        double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}