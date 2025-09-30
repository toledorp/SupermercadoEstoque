/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.supermercadoestoque;

/**
 *
 * @author fatec-dsm2
 */
import java.util.Scanner;

public class SupermercadoEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produtos[] produtos = new Produtos[3]; // Array para armazenar 3 produtos

        // Cadastro dos 3 produtos
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do Produto " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preco do Produto " + (i + 1) + ": ");
            double preco = scanner.nextDouble();

            System.out.print("Digite a quantidade em estoque do Produto " + (i + 1) + ": ");
            int quantidade = scanner.nextInt();

            // Consumir a quebra de linha pendente após nextInt()
            scanner.nextLine();

            System.out.print("Digite o codigo do Produto " + (i + 1) + ": ");
            String codigo = scanner.nextLine();

            // Criar e armazenar o objeto Produto
            produtos[i] = new Produtos(nome, preco, quantidade, codigo);
            System.out.println(); // Linha em branco para melhor visualização
        }

        // Exibir os detalhes de todos os produtos
        System.out.println("\n=== LISTA DE PRODUTOS CADASTRADOS ===\n");
        for (Produtos p : produtos) {
            p.exibirDetalhes();
        }

        scanner.close();
    }
}