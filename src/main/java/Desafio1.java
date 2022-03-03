import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> valor = new ArrayList<Integer>();
        //inclusão de valores na lista
        valor.add(9);
        valor.add(2);
        valor.add(1);
        valor.add(4);
        valor.add(6);

        //Lógica para buscar o valor no meio da lista
        int meio = valor.size() / 2;

        //ordenação em ordem crescente na lista
        valor = valor.stream().sorted().collect(Collectors.toList());

        System.out.println(valor.get(meio));

    }
}
