package orientacao_a_objetos.orientacao_a_objetos_pt2.classe_abstrata;

public class ProdutoPericivel extends Produto{
    String dataValidade;

    @Override
    public void imprimirDescricao() {
        System.out.println("Descrição: "+ super.getDescricao() + ". Data de vencimento: "+ dataValidade );
    }
}
