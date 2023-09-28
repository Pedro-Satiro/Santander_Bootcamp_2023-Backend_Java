package entities;

public class produtos {

    public String nome;
    public double preco;
    public int quantidade;

    public double valor_totao_do_estoque() {
        return preco * quantidade;
    }
    public void add_produto(int quantidade) {
        this.quantidade += quantidade;
    }
    public void remove_produto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome + ", $" + String.format("%.2f",preco) + ", " + String.format("%d ",quantidade) + "Unidades, Total: " +valor_totao_do_estoque();
    }
}
