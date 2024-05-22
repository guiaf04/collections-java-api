package Ordenacao;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(palavrasMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String maisFrequente = "";
        int frequencia = 0;

        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            if (entry.getValue() > frequencia) {
                frequencia = entry.getValue();
                maisFrequente = entry.getKey();
            }
        }

        return maisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        // Exibe a contagem total de linguagens
        contagemLinguagens.exibirContagemPalavras();

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);

        contagemLinguagens.removerPalavra("Python");
        contagemLinguagens.exibirContagemPalavras();

        // Encontra e exibe a linguagem mais frequente
        linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
