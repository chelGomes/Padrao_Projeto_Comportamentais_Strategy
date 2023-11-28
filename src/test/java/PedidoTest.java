import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {
    @Test
    void deveCalcularValorFretePadrao() {
        Pedido pedido = new Pedido();
        pedido.calcularFrete(50.0f,100.0f);
        assertEquals(100.0f, pedido.getTotal());
    }

    @Test
    void deveCalcularValorFreteExpresso() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteExpresso(80.0f,200.0f);
        assertEquals(100.0f, pedido.getTotal());
    }

    @Test
    void deveCalcularValorFretePrioritario() {
        Pedido pedido = new Pedido();
        pedido.calcularFretePrioritario(60.0f,70.0f);
        assertEquals(100.0f, pedido.getTotal());
    }
}
