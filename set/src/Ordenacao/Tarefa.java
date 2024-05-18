package Ordenacao;

public class Tarefa {
    private boolean Status;
    private String Descricao;

    public Tarefa(String descricao){
        this.Status = false;
        this.Descricao = descricao;
    }

    public boolean isStatus() {
        return Status;
    }

    public String getDescricao() {
        return Descricao;
    }

    @Override
    public String toString() {
        return "[" + Descricao + ", " + (Status ? "Concluida" : "Pendente") + "]";
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

}
