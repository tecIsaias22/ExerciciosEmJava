import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        for(int i = num; i >= 0; i--){
            System.out.println(i);
        }
        scanner.close();
    }
}