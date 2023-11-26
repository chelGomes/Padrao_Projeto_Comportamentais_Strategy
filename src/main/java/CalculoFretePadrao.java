public class CalculoFretePadrao implements CalculoFrete{
    public float calcular(float peso, float distancia) {

        return peso + 0.3f * distancia;
    }
}
