import java.util.Scanner;

public class ContadorDeVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase qualquer: ");
        String frase = scanner.nextLine();
        frase = frase.toLowerCase(); // Agora todas as letras estão minúsculas

        int contadorVogais = 0;


        for (int i = 0; i < frase.length(); i++) {
            char charAtual = frase.charAt(i);

            if(charAtual == 'a' || charAtual == 'e'||charAtual == 'i'||charAtual == 'o'||charAtual == 'u'){
                contadorVogais++;
            }
        }
        System.out.println("Quantidade de vogais: " + contadorVogais);
        scanner.close();
    }
}
