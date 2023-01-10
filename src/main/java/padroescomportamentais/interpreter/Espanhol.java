package padroescomportamentais.interpreter;

public class Espanhol implements InterpretadorTraducao {

    private String x;
    private String y;
    private String frase;
    public Espanhol(String frase, Palavra elementoEsquerda, Palavra elementoDireita) {
        this.frase = frase;
        x = elementoEsquerda.getPalavra();
        y = elementoDireita.getPalavra();
    }

    public String traduzir() {
        return "Frase Original: "+ this.frase +
        "\nEspanhol: " + x + " " + y;
    }
}
