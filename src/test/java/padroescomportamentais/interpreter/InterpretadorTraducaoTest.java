package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpretadorTraducaoTest {

    @Test
    void deveCalcularTraducaoIngles() {
        InterpretadorTraducao interpretador = new InterpretadorPalavrasEFrases("Dia bonito","Bealtiful Ingles Day");
        assertEquals("Frase Original: Dia bonito\n" +
                "Ingles: Bealtiful Day", interpretador.traduzir());
    }

    @Test
    void deveCalcularTraducaoEspanhol() {
        InterpretadorTraducao interpretador = new InterpretadorPalavrasEFrases("Dia bonito","hermoso Espanhol dia");
        assertEquals("Frase Original: Dia bonito\n" +
                "Espanhol: hermoso dia", interpretador.traduzir());
    }

    @Test
    void deveCalcularTraducaoFrances() {
        InterpretadorTraducao interpretador = new InterpretadorPalavrasEFrases("Dia bonito","Magnifique Frances journee");
        assertEquals("Frase Original: Dia bonito\n" +
                "Frances: Magnifique journee", interpretador.traduzir());
    }

    @Test
    void deveCalcularTraducaoLatim() {
        InterpretadorTraducao interpretador = new InterpretadorPalavrasEFrases("Dia bonito","Pulchra Latim dies");
        assertEquals("Frase Original: Dia bonito\n" +
                "Latim: Pulchra dies", interpretador.traduzir());
    }

    @Test
    void deveRetonarExcecaoElementoInvalido() {
        try {
            InterpretadorTraducao interpretador = new InterpretadorPalavrasEFrases("Dicionario ^ 2", "Dicionario ^ 2");
            assertEquals("Frase Original: Dicionario ^ 2\n" +
                    "Ingles: Dicionario 2", interpretador.traduzir());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoInvalida() {
        try {
            InterpretadorTraducao interpretador = new InterpretadorPalavrasEFrases("Banana Ingles", "Banana Ingles");
            assertEquals("Banana Ingles", interpretador.traduzir());
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão inválida", e.getMessage());
        }
    }
}