package secao09_construtoresSobrecargaEncapsulamento.exercicios.Aula90_Exercicio1.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this(name ,price,0);
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public String toString() {
        return "Product data: " + name + ", $ " + String.format("%.2f", price) + ", " + quantity + " " +
                "units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
