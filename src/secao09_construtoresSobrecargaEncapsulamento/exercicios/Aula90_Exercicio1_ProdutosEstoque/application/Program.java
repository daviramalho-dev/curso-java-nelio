package secao09_construtoresSobrecargaEncapsulamento.exercicios.Aula90_Exercicio1_ProdutosEstoque.application;

import secao09_construtoresSobrecargaEncapsulamento.exercicios.Aula90_Exercicio1_ProdutosEstoque.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);
        /*
         * Criar uma classe Product com:
         * - name
         * - price
         * - quantity
         *
         * Regras:
         * - quantity não pode ser alterada diretamente;
         * - entrada e saída do estoque devem ocorrer por métodos;
         * - calcular valor total em estoque.
         *
         * Métodos esperados:
         * - addProduct(int quantity)
         * - removeProduct(int quantity)
         * - totalValueInStock()
         * - toString()
         *
         * Criar construtores:
         * - com todos os atributos;
         * - sem quantidade inicial.
         *
         * O programa deve:
         * 1. Ler os dados do produto;
         * 2. Mostrar os dados;
         * 3. Adicionar produtos no estoque;
         * 4. Mostrar dados atualizados;
         * 5. Remover produtos do estoque;
         * 6. Mostrar dados atualizados.
         */

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = daviScanner.nextLine();
        System.out.println("Price: ");
        double price = daviScanner.nextDouble();
        System.out.println("Quantity: ");
        int quantity = daviScanner.nextInt();

        Product product = new Product(name, price, quantity);
        System.out.println(product);

        System.out.println("Enter the number of products to be added in stock: ");
        int addInStock = daviScanner.nextInt();
        product.addProduct(addInStock);
        System.out.println("Updated data: ");
        System.out.println(product);

        System.out.println("Enter the number of products to be removed in stock: ");
        int removeInStock = daviScanner.nextInt();
        product.removeProduct(removeInStock);
        System.out.println("Updated data: ");
        System.out.println(product);

        daviScanner.close();
    }
}
