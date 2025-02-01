package application;

import entities.Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Empresa> listId = new ArrayList<>(); // tipo da lista sera nossa classe q tem as coisas q precisa

        System.out.println("quantos funcionarios serao cadastrados?");
        int qtd = sc.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.println("funcionario: " + i);
            
            System.out.println("id: ");
            int id = sc.nextInt();

            // n sabia fazer a validacao pq tentei com indexof e n deu certo
            if (hasId(listId, id)) { // prof usou hasid mas nao entendi?
                System.out.print("id ja existente");
                id = sc.nextInt();
            }

            System.out.println("nome: ");
            String nome = sc.next();

            System.out.println("salario: ");
            double salario = sc.nextDouble();

            listId.add(new Empresa(id, nome, salario)); // nao sabia fazer isso e nem como isso funcionaria
            // btw sempre na ordem dos paramertos
        }

        // fiquei confusa de como pegaria o id mas precisa fazer essa formula enorme q eu preciso aprender
        System.out.println("insira o id do funcionario que tera aumento: ");
        int id = sc.nextInt();
        Empresa emp = listId.stream().filter(x -> x.getId() == id).findFirst().orElse(null); // NAO ENTENDO ISSO E MTO DIFICIL

        if (emp == null) {
            System.out.println("id nao existente");
        }
        else{
            System.out.println("insira a porcentagem: ");
            double porcentagem = sc.nextDouble();
            emp.aumentoSalario(porcentagem);
        }

        System.out.println("funcionarios: ");
        for (Empresa x : listId){ // for each
            System.out.println(x); // precisei fazer toString
        }

        sc.close();

    }

    // n entendi pq ta aq e nao na classe empresa mas esse fiz c ajuda tb
    // aprender a formula
    public static boolean hasId(List<Empresa> list, int id) {
        Empresa emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}