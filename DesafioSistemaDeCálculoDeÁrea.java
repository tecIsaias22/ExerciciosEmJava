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


