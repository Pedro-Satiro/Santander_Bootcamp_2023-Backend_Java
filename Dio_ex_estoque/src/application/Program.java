package application;

import entities.produtos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        produtos produtos = new produtos();
        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        produtos.nome = sc.nextLine();
        System.out.print("Preco: ");
        produtos.preco = sc.nextDouble();
        System.out.print("Quantitade no estoque: ");
        produtos.quantidade = sc.nextInt();

        System.out.println("Dados do produto: " + produtos);

        System.out.println();
        System.out.println("Digite o numero de produtos para ser adicionado ao estoque");
        int quantidade = sc.nextInt();
        produtos.add_produto(quantidade);
        System.out.println("Dados atualizado do produto: " + produtos);

        System.out.println();
        System.out.println("Digite o numero de produtos para ser removido do estoque");
        quantidade = sc.nextInt();
        produtos.remove_produto(quantidade);

        System.out.println("Dados atualizado do produto: " + produtos);

        //System.out.println(produtos.nome + ", "+ produtos.preco +", " + produtos.quantidade);

        sc.close();
    }
}
