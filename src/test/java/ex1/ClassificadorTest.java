package ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ClassificadorTest {
    private final Classificador classificador = new Classificador();

    @Test
    public void testaClassificacaoAlto() {
        String resultado = classificador.classificar(11);
        assertEquals("ALTO", resultado);

        String resultado2 = classificador.classificar(10);
        assertNotEquals("ALTO", resultado2);
    }

    @Test
    public void testaClassificacaoCasoRaro() {
        String resultado = classificador.classificar(-9999);
        assertEquals("CASO RARO", resultado);
    }

    @Test
    public void testaClassificacaoBaixo() {
        String resultado = classificador.classificar(9);
        assertEquals("BAIXO", resultado);
    }

    @Test
    public void testaClassificacaoMedio() {
        String resultado = classificador.classificar(10);
        assertEquals("MÉDIO", resultado);
    }
}
