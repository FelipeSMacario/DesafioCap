import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Desafio3Testes {

    @Test
    void checaRaizQuadrada(){
        int valor = 25;
        Assertions.assertEquals(5, Math.sqrt(valor));
    }

    @Test
    void checaRemoveEspaco(){
        String palavra = "tenha um bom dia";
        Assertions.assertEquals("tenhaumbomdia", palavra.replaceAll("\\s+", ""));
    }

    @Test
    void checaArredonda(){
        int valor = 4;
        Assertions.assertEquals(4, Math.round(valor));
    }
}
