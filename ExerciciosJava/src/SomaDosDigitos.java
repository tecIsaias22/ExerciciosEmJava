import java.util.Scanner;

public class SomaDosDigitos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = scanner.nextInt();
        int soma = 0;

        while (num1 > 0){

           int digito = num1 % 10;
           soma =soma + digito;

           //Soma o digito a vareavel
            num1 = num1 / 10 ;
        }
        System.out.println("Soma dos dígitos: " + soma);

    }
}
