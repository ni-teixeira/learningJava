import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // list eh uma interface, dados sempre do mesmo tipo, inicia vazia e sao alocados os elementos sob demanda
        // cada elemento ocupa um no (nodo) da lista
        // p instanciar precisa de uma classe ArrayList LinkedList
        // acesso sequencial aos elementos, mas dependendo da implementacao da lista essa navegacao eh otimizada

        // size() -> tamanho da lista
        // add(obj), add(int,obj) // remove(obj), remove(int), removeIf(predicate) -> add ou remove itens
        // indexOf(), lastIndexOf() -> posicao do elemento
        // List <Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList()) -> filtro c base em predicado
        // Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null) -> filtra a primeira ocorrencia c predicado

        // usa a wrapper class
        // parametrizar a definicao de um tipo informando um outro tipo especifico q vc quiser -> generics
        // p implementar precisa de uma classe q implementa a interface
        List <String> list = new ArrayList<>();

        // add coisas na lista
        list.add("luna");
        list.add("pitchuca");
        list.add("jupiter");
        list.add("bolinha");
        list.add("spot");
        list.add(2, "aya"); // sobrecarga

        // tamanho da lista
        System.out.println(list.size());

        // remover obj
        list.remove("aya");
        list.removeIf(x -> x.charAt(0) == 's'); // funcao lambda - predicado-

        // encontrar um elemento
        System.out.println(list.indexOf("pitchuca"));

        // filtros
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'p').collect(Collectors.toList());
        // List<String> result = list.stream().filter(x -> x.charAt(0) == 'p').toList();

        // for each
        for (String x : list){
            System.out.println(x);
        }


    }
}