public class FreteCalculadora {
    private float peso;
    private float distancia;

    public FreteCalculadora(float peso, float distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public float calcular(CalculoFrete calculoFrete) {
        return calculoFrete.calcular(peso, distancia);
    }
}
