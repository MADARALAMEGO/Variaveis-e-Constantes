package logica.progamacao_orientada_a_objetos.metodo_instancia;

public class Cliente {
    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;
    String obterNomeCompleto() {
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }

    String obterDDD() {
        String ddd = telefone.substring(0, 2);
        return ddd;
    }
}
