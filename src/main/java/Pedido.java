public class Pedido {
    private float total;

    public float getTotal() {
        return total;
    }

    public void calcularFrete(float peso, float distancia) {
        FreteCalculadora calculadora = new FreteCalculadora(peso, distancia);
        this.total = calculadora.calcular(new CalculoFretePadrao());
    }

    public void calcularFreteExpresso(float peso, float distancia) {
        FreteCalculadora calculadora = new FreteCalculadora(peso, distancia);
        this.total = calculadora.calcular(new CalculoFreteExpresso());
    }

    public void calcularFretePrioritario(float peso, float distancia) {
        FreteCalculadora calculadora = new FreteCalculadora(peso, distancia);
        this.total = calculadora.calcular(new CalculoFretePrioritario());
    }
}
