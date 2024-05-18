package Pesquisa;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> ListaAlunos;

    public GerenciadorAlunos() {
        this.ListaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        ListaAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno AlunoRemovido = null;

        for (Aluno a : ListaAlunos) {
            if (a.getMatricula() == matricula) {
                AlunoRemovido = a;
                break;
            }
        }

        ListaAlunos.remove(AlunoRemovido);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> AlunosPorNome = new TreeSet<>(ListaAlunos);

        return AlunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> AlunosPorNota = new TreeSet<Aluno>(new ComparatorPorMedia());
        AlunosPorNota.addAll(ListaAlunos);
        return AlunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(ListaAlunos);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123456L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 8.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        gerenciadorAlunos.exibirAlunos();

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123458L);
        gerenciadorAlunos.exibirAlunos();

        // Exibindo alunos ordenados por nome
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        // Exibindo alunos ordenados por nota
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
