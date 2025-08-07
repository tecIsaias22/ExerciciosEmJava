import java.util.Scanner;

public class PalíndromoNumérico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        int origi = num;
        int inver = 0;

        while (num > 0) {
            int arma = num % 10;
            inver = inver * 10 + arma;
            num = num / 10;
        }
        if (origi == inver) {
            System.out.println("O número é palíndromo.");
        } else {
            System.out.println("O número não é palíndromo.");
        }

        scanner.close();
    }
}
