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