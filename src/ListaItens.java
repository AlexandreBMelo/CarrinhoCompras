import java.util.ArrayList;
import java.util.List;

public class ListaItens {
    // Este atributo cria uma lista (List) para armazenar objetos do tipo Item e a
    // nomeia como produtos.
    private List<Item> produtos;

    // Construtor que inicializa taskList como um ArrayList que pode armazenar
    // objetos do tipo Tasks
    public ListaItens(){
        this.produtos = new ArrayList<>();
    }
        // Método para adicionar um item (Item) a lista produtos
    public void addItem(String nome, double preco, int quantidade){
        produtos.add(new Item(nome, preco, quantidade));
    }
    public void removeItem(String nome){
        List<Item> produtosParaRemover = new ArrayList<>();
        for(Item produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)){
                produtosParaRemover.add(produto);
            }
        }
        produtos.removeAll(produtosParaRemover);
    }
    public double calcularValorTotal(){
    double valorTotal = 0.0;
    for (Item produto : produtos){
        valorTotal += produto.getPreco() * produto.getQuantidade();
    }
    return valorTotal;
    }
    public void exibirItens(){
        System.out.println(produtos);
    }
}
