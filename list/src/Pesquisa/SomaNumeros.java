package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    public List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "SomaNumeros [numerosList=" + numerosList + "]";
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numerosList.isEmpty()) {
            for (Integer n : numerosList) {
                soma += n;
            }
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
        return soma;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numerosList.isEmpty()) {
            for (Integer n : numerosList) {
                if (n < menorNumero)
                    menorNumero = n;
            }
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
        return menorNumero;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numerosList.isEmpty()) {
            for (Integer n : numerosList) {
                if (n > maiorNumero)
                    maiorNumero = n;
            }
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
        return maiorNumero;
    }

    public List<Integer> exibirNumeros() {
        return this.numerosList;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        System.out.println(somaNumeros.exibirNumeros());

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}