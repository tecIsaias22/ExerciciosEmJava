// Classe abstrata - serve como "molde" para todas as formas
abstract class Forma {
    // Método abstrato: cada forma vai implementar sua própria forma de calcular a área
    public abstract double calcularArea();
}

// Classe Retangulo que herda de Forma
class Retangulo extends Forma {
    private double largura;
    private double altura;

    // Construtor do Retangulo
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação do método calcularArea específico do Retangulo
    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

// Classe Circulo que herda de Forma
class Circulo extends Forma {
    private double raio;

    // Construtor do Circulo
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação do método calcularArea específico do Circulo
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio; // π * r²
    }
}

// Classe principal
public class DesafioSistemaDeCálculoDeÁrea {

    public static void main(String[] args) {
        // Criando objetos de Retangulo e Circulo usando polimorfismo
        Forma r = new Retangulo(3, 3); // largura = 3, altura = 3
        Forma c = new Circulo(4);      // raio = 4

        // Chamando o método estático mostrarArea para cada forma
        mostrarArea(r); // imprime área do Retângulo
        mostrarArea(c); // imprime área do Círculo
    }

    // Método estático que recebe qualquer Forma e mostra sua área
    public static void mostrarArea(Forma f) {
        // f.getClass().getSimpleName() retorna o nome da classe do objeto (Retangulo ou Circulo)
        System.out.println("Área da " + f.getClass().getSimpleName() + ": " + f.calcularArea());
    }
}


