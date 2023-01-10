package padroescomportamentais.interpreter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class InterpretadorPalavrasEFrases implements InterpretadorTraducao {

    private InterpretadorTraducao interpretadorInicial;

    public InterpretadorPalavrasEFrases(String frase, String contexto) {
        Stack<InterpretadorTraducao> pilhaInterpretadores = new Stack<>();
        List<String> elementos = Arrays.asList(contexto.split(" "));
        Iterator<String> iterator = elementos.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals("Espanhol")) {
                Palavra elementoEsquerda = (Palavra) pilhaInterpretadores.pop();
                Palavra elementoDireita = new Palavra(iterator.next());
                Espanhol interpretador = new Espanhol(frase, elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Palavra(interpretador.traduzir()));
            } else if (elemento.equals("Frances")) {
                Palavra elementoEsquerda = (Palavra) pilhaInterpretadores.pop();
                Palavra elementoDireita = new Palavra(iterator.next());
                Frances interpretador = new Frances(frase, elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Palavra(interpretador.traduzir()));
            } else if (elemento.equals("Ingles")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressão inválida");
                Palavra elementoEsquerda = (Palavra) pilhaInterpretadores.pop();
                Palavra elementoDireita = new Palavra(iterator.next());
                Ingles interpretador = new Ingles(frase, elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Palavra(interpretador.traduzir()));
            } else if (elemento.equals("Latim")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressão inválida");
                Palavra elementoEsquerda = (Palavra) pilhaInterpretadores.pop();
                Palavra elementoDireita = new Palavra(iterator.next());
                Latim interpretador = new Latim(frase, elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Palavra(interpretador.traduzir()));
            } else {
                if (elemento.matches("\\b[a-z?A-Z]+\\b")) {
                    pilhaInterpretadores.push(new Palavra(elemento));
                }
                else{
                throw new IllegalArgumentException("Expressão com elemento inválido");
                }
            }
        }
        interpretadorInicial = pilhaInterpretadores.pop();
    }

    public String traduzir() {
        return interpretadorInicial.traduzir();
    }
}
