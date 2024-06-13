package ListaTarefas;
public class Tarefa {
    private String descricao;
    //construtor
    public Tarefa(String descricao){
        this.descricao=descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    @Override
    public String toString() {
        return "Descricao: "+ descricao;
    }
}
