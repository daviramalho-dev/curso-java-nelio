package secao08_introduçao_POO.aulas.Aula74a76_EstoqueComPOO.application;

import java.util.Scanner;

import secao08_introduçao_POO.aulas.Aula74a76_EstoqueComPOO.entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = daviScanner.nextLine();

        System.out.print("Price: ");
        product.price = daviScanner.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = daviScanner.nextInt();

        System.out.println("\nProduct data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = daviScanner.nextInt();
        product.addProducts(quantity);

        System.out.println("\nUpdate data: " + product);

        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = daviScanner.nextInt();
        product.removeProducts(quantity);

        System.out.println("\nUpdate data: " + product);

        daviScanner.close();
    }
}
