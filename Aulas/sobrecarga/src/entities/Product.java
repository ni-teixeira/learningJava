package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    // criacao de um construtor, ele cria o metodo passando parametros p **obrigar o fornecimento de dados ao objeto no momento da instanciação**
    // ter o mesmo nome da classe, apenas public, sem return, sempre depois dos atributos
    public Product(String name, double price, int quantity){
        this.name = name; // o this eh usado para referenciar o parametro e o atributo
        this.price = price; // atributo = parametro
        this.quantity = quantity;
    }

    // sobrecarga eh disponibilizar mais de uma operacao c o mesmo nome, mas com parametros diferentes
    // Exemplo: Na instanciação do produto, onde passamos o nome, o preço e a quantidade, podemos nos deparar com um produto
    // de quantidade 0 no estoque. Para nao ser obrigatória a passagem da quantidade na hora que o construtor é instanciado,
    // podemos criar outro construtor que peça apenas o nome e o preço

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        // quantity = quantity nao porecisa por pq ele ja vai iniciar com zero!
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