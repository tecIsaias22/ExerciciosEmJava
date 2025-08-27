import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    public String nome;
    public String telefone;

    Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
}

public class AgendaDeContatosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        // Contato inicial
        Contato contato = new Contato("isaias", "(00)00000-0000");
        contatos.add(contato);

        int opcao;

        do {
            System.out.println("\n1 - Listar todos os contatos");
            System.out.println("2 - Procurar contato pelo nome");
            System.out.println("4 - Adicionar novo contato");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do Enter

            switch (opcao) {
                case 1:
                    // Lista todos os contatos
                    for (Contato c : contatos) {
                        System.out.println("Nome: " + c.nome + " | Telefone: " + c.telefone);
                    }
                    break;

                case 2:
                    // Procurar contato pelo nome
                    System.out.print("Digite o nome do contato que deseja procurar: ");
                    String nomeDigitado = scanner.nextLine();
                    Contato resultado = procuraContato(contatos, nomeDigitado);

                    if (resultado != null) {
                        System.out.println("Nome: " + resultado.nome + " | Telefone: " + resultado.telefone);
                    } else {
                        System.out.println("Contato não encontrado");
                    }
                    break;

                case 4:
                    // Adicionar novo contato
                    System.out.print("Digite o nome do novo contato: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o telefone do novo contato: ");
                    String novoTelefone = scanner.nextLine();

                    Contato novoContato = new Contato(novoNome, novoTelefone);
                    contatos.add(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println("Saindo da agenda...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scanner.close();
    }

    public static Contato procuraContato(ArrayList<Contato> lista, String nome) {
        for (Contato p : lista) {
            if (p.nome.equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }
}
