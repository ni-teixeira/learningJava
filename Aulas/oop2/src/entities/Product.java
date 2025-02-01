package entities;

public class Product {

    public String name;
    public double price;
    public int qtd;

    public double totalValueInStock(){
        return price * qtd;
    }

    public void addProducts(int qtd){
        this.qtd += qtd;
         // this eh a autoref do objeto
        // this.qtd ta buscando o objeto qtd criado e somando ao parametro qtd
    }

    public void removeProducts(int qtd){
        this.qtd -= qtd;
    }

    // implementando toString
    public String toString(){
        return name + ", $ " + price + ", " + qtd + " unidades, total: $" + String.format("%.2f", totalValueInStock());
    }

}
