public class MudarStrings {
    private String palavras = "" ;

    public MudarStrings(String palavras){

        this.palavras = palavras;
    }

    public String UrlCorreta(String url){

        String urlUtil = this.palavras.replace("/", "\\");

        return urlUtil;
    }
    
}
