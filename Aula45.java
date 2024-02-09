import java.nio.file.*;

public class Aula45 {
    public static void main(String[] args){

        
        Path logoNova = Paths.get("C:/Users/natal/OneDrive/Imagens/escudoNovo.jpg");
        Path logoAntiga = Paths.get("C:/Users/natal/OneDrive/Imagens/logoANtigo.png");

        try{
            byte[] bytesLogoNovo = Files.readAllBytes(logoNova);
            Files.write(logoAntiga, bytesLogoNovo);

        }catch(Exception e){
            System.out.println("erro" + e.getMessage());
        }
    }
    
}
