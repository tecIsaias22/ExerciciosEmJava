import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Pedir o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Pedir a operação
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.next();

        double resultado;

        // Lógica da operação usando if-else
        if (operacao.equals("+")) {
            resultado = num1 + num2;
        } else if (operacao.equals("-")) {
            resultado = num1 - num2;
        } else if (operacao.equals("*")) {
            resultado = num1 * num2;
        } else if (operacao.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
                scanner.close();
                return; // encerra o programa
            }
        } else {
            System.out.println("Operação inválida.");
            scanner.close();
            return; // encerra o programa
        }

        // Exibe o resultado
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}

