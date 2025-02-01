package entities;

public class Product {

    private String name; // encapsulamento eh esconder a implementacao da classe
    private double price; // atributos como private
    private int quantity;

    // private -> acessado apenas na sua propria classe
    // nada -> acessado apenas nas classes do msm pacote
    // protected -> acessado no mesmo pacote e em subclasses de pacotes diferentes
    // public -> acessado por todas as classes (menos se tiver em um modulo dif que nao foi importado)

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // os atributos sao acessados por meio de metodos get e set -> camelCase
    // get -> retornar o valor
    // set -> modificar ou atribuir outro valor

    public String getName() {
        return name;
    } // get sempre tem o return p retornar seu valor

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // set eh necessario passar o parametro e sua referencia p o atributo
    public void setName(String name) {
        this.name = name; // set sempre tem o void
        // uso de this, autoreferencia do parametro
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ "  + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}