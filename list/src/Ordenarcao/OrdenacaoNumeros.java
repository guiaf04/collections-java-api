package Ordenarcao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros [numerosList=" + numerosList + "]";
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numeroAscenList = new ArrayList<>(numerosList);

        if (!numerosList.isEmpty()) {
            Collections.sort(numeroAscenList);
        }

        return numeroAscenList;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numeroDescList = new ArrayList<>(numerosList);

        if (!numerosList.isEmpty()) {
            numeroDescList.sort(Collections.reverseOrder());
        }

        return numeroDescList;
    }

    public void exibirNumeros(){
        System.out.println(numerosList);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }

}
