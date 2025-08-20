import java.util.ArrayList;
import java.util.Scanner;

//class produto
class Produto{
     public String nome;
     public int quantidade;

    // Construtor
    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // metodos para alterar estoque
    public void adicionarQuantidade(int valor){
        quantidade += valor;
    }
    public void removeQuantidade(int valor){
        if(valor <= quantidade){
            quantidade -= valor;
        }else{
            System.out.println("Estoque insuficiente!");
        }
    }
}


public class ControleDeEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ESTOQUE ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Adicionar quantidade");
            System.out.println("3 - Remover quantidade");
            System.out.println("4 - Mostrar estoque");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // cadastrar produto
                    break;
                case 2:
                    // adicionar quantidade
                    break;
                case 3:
                    // remover quantidade
                    break;
                case 4:
                    // mostrar estoque
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        scanner.close();
    }
    // Método para buscar produto pelo nome
    public static Produto buscarProduto(ArrayList<Produto> lista, String nome) {
        for (Produto p : lista) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }
}

