package entities;

public class Rectangle {

    public double base;
    public double altura;

    public double area(){
        return base * altura;
    }

    public double perimeter(){
        return 2 * (base + altura);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

}