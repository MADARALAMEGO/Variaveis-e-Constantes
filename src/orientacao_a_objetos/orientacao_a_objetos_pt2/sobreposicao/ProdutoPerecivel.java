package orientacao_a_objetos.orientacao_a_objetos_pt2.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
    protected Date dataValidade;
    public void identificar(){
        System.out.println("Data de Validade: "+ dataValidade);
    }
}
