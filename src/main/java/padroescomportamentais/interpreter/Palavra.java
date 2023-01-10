package padroescomportamentais.interpreter;

public class Palavra implements InterpretadorTraducao {

    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String traduzir() {
        return palavra;
    }

    public String getPalavra() {
        return this.palavra;
    }

}
