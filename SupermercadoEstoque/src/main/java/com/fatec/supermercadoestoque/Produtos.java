/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.supermercadoestoque;

/**
 *
 * @author fatec-dsm2
 */
public class Produtos {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String codigo;

    // Construtor
    public Produtos(String nome, double preco, int quantidadeEstoque, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.codigo = codigo;
    }

    // Getters (não são obrigatórios, mas boas práticas)
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public String getCodigo() { return codigo; }

    // Método para exibir os detalhes do produto
    public void exibirDetalhes() {
        System.out.println("--- DETALHES DO PRODUTO ---");
        System.out.println("Nome: " + nome);
        System.out.printf("Preco: R$ %.2f%n", preco);
        System.out.println("Em Estoque: " + quantidadeEstoque + " unidades");
        System.out.println("Codigo: " + codigo);
        System.out.println("---------------------------");
    }
}