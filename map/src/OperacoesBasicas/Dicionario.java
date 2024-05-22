package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> DicionarioMap;

    public Dicionario(){
        this.DicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        DicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!DicionarioMap.isEmpty()){
            DicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(DicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = " ";
        if(!DicionarioMap.isEmpty()){
            definicao = DicionarioMap.get(palavra);
        }

        return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
