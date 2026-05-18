import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoServico {
    private final String CAMINHO_ARQUIVO = "tarefas.txt";

    public void salvar(List<Tarefa> tarefas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO))) {
            for (Tarefa t : tarefas) {
                bw.write(t.toLinhaArquivo());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }

    public List<Tarefa> carregar() {
        List<Tarefa> tarefas = new ArrayList<>();
        File arquivo = new File(CAMINHO_ARQUIVO);
        if (!arquivo.exists()) return tarefas;

        try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                tarefas.add(Tarefa.deLinhaArquivo(linha));
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar do arquivo: " + e.getMessage());
        }
        return tarefas;
    }
}public class ArquivoServico {

}
