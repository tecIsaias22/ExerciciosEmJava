import java.util.ArrayList;

// Classe Cliente
class Cliente {
    private String nome;
    private String cpf;

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

// Classe Conta
class Conta {
    private int numeroDaConta;
    private double saldo;
    private Cliente cliente;

    // Construtor
    public Conta(int numeroDaConta, Cliente cliente) {
        this.numeroDaConta = numeroDaConta;
        this.cliente = cliente;
        this.saldo = 0.0; // começa zerado
    }

    // Getters
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Métodos principais
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }
}

// Classe Banco
class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta procurarConta(int numeroDaConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroDaConta() == numeroDaConta) {
                return conta;
            }
        }
        return null; // se não encontrar
    }
}

// Classe principal
public class SistemaBancario {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Isaias", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");

        // Criando contas
        Conta conta1 = new Conta(1, cliente1);
        Conta conta2 = new Conta(2, cliente2);

        // Criando banco
        Banco banco = new Banco();
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Testando operações
        conta1.depositar(500);
        conta1.transferir(200, conta2);
        conta2.sacar(50);

        // Resultados
        System.out.println("Saldo da conta 1 (" + conta1.getCliente().getNome() + "): " + conta1.getSaldo());
        System.out.println("Saldo da conta 2 (" + conta2.getCliente().getNome() + "): " + conta2.getSaldo());
    }
}
