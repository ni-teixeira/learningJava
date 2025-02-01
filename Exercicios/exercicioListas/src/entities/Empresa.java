package entities;

public class Empresa {

    private Integer id;
    private String nome;
    private Double salario;
    // esqueci as classes

    public Empresa(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentoSalario(double porcentagem){
         salario += (salario * porcentagem) / 100.0; // esqueci de multriplicar e dividir
    }

    public String toString(){
        return "id: " + getId() + ", nome: " + getNome() + ", salario: " + getSalario();
    }
}