public class CalculoFretePrioritario implements  CalculoFrete{
    public float calcular(float peso, float distancia) {

        return 3 * peso + 0.8f * distancia;
    }
}
