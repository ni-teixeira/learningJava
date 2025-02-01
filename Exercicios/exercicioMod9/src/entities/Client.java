package entities;

public class Client {

    private int number;
    private String name;
    private double balance;

    // se tiver deposito
    public Client(int number, String name, double dep){
        this.number = number;
        this.name = name;
        deposit(dep); // chama o metodo do depósito p add o valor -> encapsulamento
        // a conta sempre vai compare com 0, mas você tem que chamar a operacao p poder fazer o deposito inicial
    }

    // se nao tiver deposito
    public Client(int number, String name){
        this.number = number;
        this.name = name;
    }

    // numero da conta nao pode nunca ser alterado
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    // name da conta pode ser alterado
    public void setName(String name) {
        this.name = name;
    }

    // saldo n pode ser modificado por set
    public double getBalance() {
        return balance;
    }

    // metodos q nao retornavam a informacao entao sao void
    public void deposit(double value){ // coloquei parametros q foram utilizados na main
        balance += value;
    }

    public void withdraw(double value){
        balance -= (value + 5.00);
    }

    public String toString(){
        return "account " + getNumber() + ", holder: " + getName() + ", balance: $" + getBalance();
    }

}