package padroescomportamentais.interpreter;

public class SiteDeTraducao {

    public static String formula = "palavra1 idioma palavra2";

    public static String traduzirPalavra(String frase, String idioma, String palavra1, String palavra2) {
        String expressao;
        expressao = formula.replace("idioma", idioma);
        expressao = expressao.replace("palavra1", palavra1);
        expressao = expressao.replace("palavra2", palavra2);
        InterpretadorTraducao interpretador = new InterpretadorPalavrasEFrases(frase, expressao);
        return interpretador.traduzir();
    }
}

