package orientacao_a_objetos_pt2.sobrecarga;

public class TesteCadastro {
    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("José", 32);
        cadastro.cadastrar(pessoa);
        cadastro.cadastrar("Maria", 25);
    }
}
