package orientacao_a_objetos_pt2.enumeracao;

public enum Naipe {
    OURO("Vermelho"), PAUS("Preto"), ESPADA("Preto"), COPAS("Vermelho");
    private String cor;
    Naipe(String cor){
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
}
