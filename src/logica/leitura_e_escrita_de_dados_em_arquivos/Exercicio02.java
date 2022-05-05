package logica.leitura_e_escrita_de_dados_em_arquivos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class Exercicio02 {

    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:\\Users\\Aluno\\Desktop\\arquivo.txt");
        List<String> linhas = Files.readAllLines(arquivo);
        for (int i = 0; i < linhas.size(); i++) {
            String tarefas = linhas.get(i);
            System.out.println("Tarefas " + i + ": " + tarefas);
        }
    }
}
