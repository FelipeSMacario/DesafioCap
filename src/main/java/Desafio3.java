import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fraseFiltrada = new ArrayList<>();
        String frase = scanner.nextLine();
        String frase2 = "";

        //comando para remoção de espaços na strings
        frase = frase.replaceAll("\\s+", "");

        //atribuição do valor com base no tamanho da string pela raiz quadrada.
        int quantidade = (int) Math.round(Math.sqrt(frase.length()));


        //repetição responsável por dividir a string com base no resultado da raiz quadrada do resultado e atribuindo a uma lista
        for (int c = 0; c < frase.length(); c += quantidade) {

            if ((frase.length() - 1) - c < quantidade) {
                fraseFiltrada.add(frase.substring(c, frase.length()));
            } else fraseFiltrada.add(frase.substring(c, c + quantidade));
        }

        //for responsável por concatenar os caracteres baseados na string dividida
        for (int c = 0; c < fraseFiltrada.size(); c++) {
            for (int d = 0; d < fraseFiltrada.size(); d++) {

                if (fraseFiltrada.get(d).length() <= c) {
                    continue;
                }
                frase2 = frase2 + (fraseFiltrada.get(d).charAt(c));
            }
            frase2 = frase2 + " ";
        }

        System.out.println(frase2);
    }
}
