package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> ConjuntoPalavras;

    ConjuntoPalavrasUnicas() {
        this.ConjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        ConjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String PalavraRemovida = "";

        for (String p : ConjuntoPalavras) {
            if (p.equalsIgnoreCase(palavra)) {
                PalavraRemovida = p;
                ConjuntoPalavras.remove(p);
                break;
            }
        }
        System.out.println("Palavra " + PalavraRemovida + " removida");
    }

    public boolean verificarPalavra(String palavra) {
        return ConjuntoPalavras.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(ConjuntoPalavras);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [ConjuntoPalavras=" + ConjuntoPalavras + "]";
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
