import java.util.Scanner;

public class ParesEImparesSeparados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escreva um digito minimo: ");
        int nu = scanner.nextInt();


        for(int i = 0; i <= nu ; i++){
            if(i % 2 == 0){
                System.out.println("Esse Numero E Par: " + i);
            }else{
                System.out.println("Esse Numero impar: " + i);
            }
        }
        scanner.close();


    }
}
