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
