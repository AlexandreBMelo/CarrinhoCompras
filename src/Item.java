public class Item {
     //Atributos necessários para a construção do objeto "Item"

    private String nome;
    private double preco;
    private int quantidade;

    // contrutor do objeto Item

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //Getters do Item

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    @Override
    public String toString() {
        return "Você está comprando" + quantidade + nome + "(s)" + "que custa " + preco;
    }
    public static void main(String[] args) {
        ListaItens listaCompras = new ListaItens();

        listaCompras.addItem("Carro", 10000.00, 2);
        listaCompras.exibirItens();
        System.out.println("O valor total é " + listaCompras.calcularValorTotal());
    }
}
