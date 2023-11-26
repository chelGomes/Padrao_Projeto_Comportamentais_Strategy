public class CalculoFreteExpresso  implements CalculoFrete{
    public float calcular(float peso, float distancia) {

        return 2 * peso + 0.5f * distancia;
    }
}
