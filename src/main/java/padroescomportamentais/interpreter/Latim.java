package padroescomportamentais.interpreter;

public class Latim implements InterpretadorTraducao {
    private String x;
    private String y;
    private String frase;
    public Latim(String frase, Palavra elementoEsquerda, Palavra elementoDireita) {
        this.frase = frase;
        x = elementoEsquerda.getPalavra();
        y = elementoDireita.getPalavra();
    }

    public String traduzir() {
        return "Frase Original: "+ this.frase +
                "\nLatim: " + x + " " + y;
    }
}
