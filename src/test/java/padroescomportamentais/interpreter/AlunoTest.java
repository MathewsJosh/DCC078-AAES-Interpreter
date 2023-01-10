package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Aluno aluno = new Aluno();
        aluno.setIdioma("Ingles");
        aluno.setFrase("Rio de Janeiro");
        aluno.setPalavra1("January");
        aluno.setPalavra2("river");

        assertEquals("Frase Original: Rio de Janeiro\n" +
                "Ingles: January river", aluno.traduzir());
    }

}