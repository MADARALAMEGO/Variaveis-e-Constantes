package orientacao_a_objetos._6_topicos_avancados;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {
    public static void main(String[] args) {
        //Comprimento de uma circuferência 2 x p x PI (3,1415)
        int raio = 4;

        double comprimento = 2 * raio * PI;
        System.out.println("Comprimento: " + comprimento);

        //Máximo e mínimo
        double[] precosProdutoA = {30.2, 25.49};
        double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
        System.out.println("Maior preço: " + maiorPreco);
        System.out.println("Menor preço: " + Math.min(precosProdutoA[0], precosProdutoA[1]));

        //Potência
        System.out.println("2³: " + Math.pow(2, 3));

        //Raiz Quadrada
        System.out.println("Raiz de 9: " + Math.sqrt(9));

        //Arredondamento ceil, floor e round
        double n = 5.4;
        System.out.println("Menor Inteiro: " + Math.floor(n));
        System.out.println("Maior Inteiro: " + Math.ceil(n));
        System.out.println("Arredondamento: " + Math.round(n));

    }
}