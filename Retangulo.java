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
