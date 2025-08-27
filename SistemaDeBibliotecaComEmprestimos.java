import java.util.ArrayList;
import java.util.Scanner;

// Classe que representa um livro
class Biblioteca {
    String titulo;
    String autor;

    // Criar livro com título e autor
    Biblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}

public class SistemaDeBibliotecaComEmprestimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de livros disponíveis
        ArrayList<Biblioteca> bibliotecas = new ArrayList<>();
        // Lista de livros emprestados
        ArrayList<Biblioteca> emprestados = new ArrayList<>();

        int opcao;

        do {
            // Menu
            System.out.println("\n1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o Enter do teclado

            switch (opcao) {
                case 1:
                    // Adicionar livro
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    bibliotecas.add(new Biblioteca(titulo, autor));
                    System.out.println("Livro adicionado!");
                    break;

                case 2:
                    // Listar livros
                    System.out.println("\nLivros disponíveis:");
                    if (bibliotecas.isEmpty()) System.out.println("Nenhum livro disponível");
                    else for (Biblioteca b : bibliotecas)
                        System.out.println(b.titulo + " | " + b.autor);

                    System.out.println("\nLivros emprestados:");
                    if (emprestados.isEmpty()) System.out.println("Nenhum livro emprestado");
                    else for (Biblioteca b : emprestados)
                        System.out.println(b.titulo + " | " + b.autor);
                    break;

                case 3:
                    // Emprestar livro
                    System.out.print("Título do livro: ");
                    String tEmprestar = scanner.nextLine();
                    System.out.print("Autor: ");
                    String aEmprestar = scanner.nextLine();

                    Biblioteca livro = null;
                    for (Biblioteca b : bibliotecas)
                        if (b.titulo.equalsIgnoreCase(tEmprestar.trim()) &&
                                b.autor.equalsIgnoreCase(aEmprestar.trim())) {
                            livro = b;
                            break;
                        }

                    if (livro != null) {
                        bibliotecas.remove(livro); // Remove da lista disponível
                        emprestados.add(livro);    // Adiciona na lista emprestada
                        System.out.println("Livro emprestado!");
                    } else System.out.println("Livro não encontrado!");
                    break;

                case 4:
                    // Devolver livro
                    System.out.print("Título do livro: ");
                    String tDevolver = scanner.nextLine();
                    System.out.print("Autor: ");
                    String aDevolver = scanner.nextLine();

                    Biblioteca devolucao = null;
                    for (Biblioteca b : emprestados)
                        if (b.titulo.equalsIgnoreCase(tDevolver.trim()) &&
                                b.autor.equalsIgnoreCase(aDevolver.trim())) {
                            devolucao = b;
                            break;
                        }

                    if (devolucao != null) {
                        emprestados.remove(devolucao); // Remove da lista emprestada
                        bibliotecas.add(devolucao);    // Volta para disponíveis
                        System.out.println("Livro devolvido!");
                    } else System.out.println("Esse livro não está emprestado!");
                    break;

                case 5:
                    // Sair do programa
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        scanner.close(); // Fecha o scanner
    }
}
