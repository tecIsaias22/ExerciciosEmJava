import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int entrada = scanner.nextInt();

        if ( entrada == 2) {
            System.out.printf("Numero Par" );

        }else{
            System.out.printf("Numero Impar");
        }
    }
}
