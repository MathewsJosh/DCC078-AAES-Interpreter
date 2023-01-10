package padroescomportamentais.interpreter;

public class Aluno {
    private String idioma;
    private String frase;

    private String palavra1;
    private String palavra2;

    public String getPalavra1() {
        return palavra1;
    }

    public void setPalavra1(String palavra1) {
        this.palavra1 = palavra1;
    }

    public String getPalavra2() {
        return palavra2;
    }

    public void setPalavra2(String palavra2) {
        this.palavra2 = palavra2;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String traduzir() {
        return SiteDeTraducao.traduzirPalavra(this.frase, this.idioma, this.palavra1, this.palavra2);
    }
}
