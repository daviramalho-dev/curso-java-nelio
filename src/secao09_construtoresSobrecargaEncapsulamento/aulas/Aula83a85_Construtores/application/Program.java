package secao09_construtoresSobrecargaEncapsulamento.aulas.Aula83a85_Construtores.application;

import java.util.Scanner;

import secao09_construtoresSobrecargaEncapsulamento.aulas.Aula83a85_Construtores.entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner daviScanner = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("\nName: ");
        String name = daviScanner.nextLine();
        System.out.print("Price: ");
        double price = daviScanner.nextDouble();
        Product product = new Product(name, price);
        

        System.out.println("\nProduct data: " + product);
        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantity = daviScanner.nextInt();
        product.addProducts(quantity);
        System.out.println("\nUpdated data: " + product);
        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = daviScanner.nextInt();
        product.removeProducts(quantity);
        System.out.println("\nUpdated data: " + product);
        
        daviScanner.close();
    }
}
