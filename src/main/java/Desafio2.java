import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int[] n = {1, 5, 3, 4, 2};
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int valor = scanner.nextInt();

        for (int c = 0; c < n.length; c++) {

            for (int d = 0; d < n.length; d++) {

                //condição que subtrai variaveis
                if (n[c] - n[d] == valor) {
                    total++;
                }

            }
        }
        System.out.println(total);

    }
}
