package logica.operadores;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        Integer adicao = 1 + 1;
        System.out.println("soma: "+ adicao);

        Integer subtracao = 2 - 1;
        System.out.println("subtração: "+ subtracao);

        Integer multiplicacao = 2 * 2;
        System.out.println("Multiplicação: "+ multiplicacao);

        Integer divisao = 4 / 2;
        System.out.println("Divisão: "+ divisao);

        Integer modulo = 7 % 4;
        System.out.println("Módulo: "+ modulo);

        Integer precendencia01 = 1 + 1 * 5;
        System.out.println("Precedente: "+ precendencia01);

        Integer precedencia02 = (1 + 1) * 5;
        System.out.println("Precedente: "+ precedencia02);

        Integer precedencia03 = 5 * (1 + 1);
        System.out.println("Precedente: "+ precedencia03);

        Integer precedente04 = 5 * (2 + (1 + 1));
        System.out.println("Precedente: "+ precedente04);

        Integer cinco = 5;
        Integer um = 1;
        Integer soma = cinco + um;
        System.out.println("Soma é igual a "+ soma);
    }
}
