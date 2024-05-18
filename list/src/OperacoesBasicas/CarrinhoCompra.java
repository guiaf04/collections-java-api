package OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    public List<Item> itemList;

    public CarrinhoCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemRemovidos = new ArrayList<>();

        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemRemovidos.add(i);
                System.out.println(i + " foi removido");
            }
        }

        itemList.removeAll(itemRemovidos);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item i : itemList) {
            valorTotal += (i.getPreco() * i.getQuantidade());
        }

        return valorTotal;
    }
    
    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) throws Exception {
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();
        
        carrinhoCompra.adicionarItem("Caixa", 15.43, 3);
        carrinhoCompra.adicionarItem("Pano", 5.43, 5);
        carrinhoCompra.adicionarItem("Bola", 35.50, 10);
        System.out.println(carrinhoCompra.calcularValorTotal());
        carrinhoCompra.exibirItens();
        carrinhoCompra.removerItem("Caixa");
        System.out.println(carrinhoCompra.calcularValorTotal());
        carrinhoCompra.exibirItens();
    }
}
