public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() { return descricao; }
    public boolean isConcluida() { return concluida; }
    
    public void concluir() { this.concluida = true; }

    @Override
    public String toString() {
        String status = concluida ? "[X]" : "[ ]";
        return status + " " + descricao;
    }

    public String toLinhaArquivo() {
        return descricao + ";" + concluida;
    }

    public static Tarefa deLinhaArquivo(String linha) {
        String[] partes = linha.split(";");
        Tarefa t = new Tarefa(partes[0]);
        if (Boolean.parseBoolean(partes[1])) {
            t.concluir();
        }
        return t;
    }
}