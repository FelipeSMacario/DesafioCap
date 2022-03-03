import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Desafio1Testes {

    @Test
    void checaMedia(){
        int media = 5;
        Assertions.assertEquals(2, media / 2);
    }

    @Test
    void checaArray() {
        List<Integer> valor = new ArrayList<Integer>();
        //inclusão de valores na lista
        valor.add(1);
        valor.add(2);
        valor.add(4);
        valor.add(6);
        valor.add(9);

        List<Integer> valor2 = new ArrayList<Integer>();
        //inclusão de valores na lista
        valor2.add(9);
        valor2.add(2);
        valor2.add(1);
        valor2.add(4);
        valor2.add(6);

        Assertions.assertNotEquals(valor, valor2);
        Assertions.assertEquals(valor, valor2.stream().sorted().toList());
    }
}
