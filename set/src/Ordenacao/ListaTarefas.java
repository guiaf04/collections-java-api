package Ordenacao;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> ListaTarefa;

    public ListaTarefas() {
        this.ListaTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        ListaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarafaRemovida = null;

        for (Tarefa t : ListaTarefa) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarafaRemovida = t;
                break;
            }
        }

        ListaTarefa.remove(tarafaRemovida);
    }

    public void exibirTarefas() {
        System.out.println(ListaTarefa);
    }

    public int contarTarefas() {
        return ListaTarefa.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> TarefasConcluidas = new HashSet<>();

        for (Tarefa t : ListaTarefa) {
            if (t.isStatus()) {
                TarefasConcluidas.add(t);
            }
        }

        return TarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> TarefasPendentes = new HashSet<>();

        for (Tarefa t : ListaTarefa) {
            if (!t.isStatus()) {
                TarefasPendentes.add(t);
            }
        }

        return TarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa t : ListaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : ListaTarefa) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatus(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        ListaTarefa.removeAll(ListaTarefa);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
