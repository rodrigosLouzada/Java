import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Aula44 {
    public static void main(String[] args){ // easy wany to fix throws IOException
        Path arquivo = Paths.get("C:\\Users\\natal\\Documents\\javaEstudos\\Animal");

        // lidar com exceção: simples
        try{
            List<String> linhas = Files.readAllLines(arquivo);

            //for(String linha : linhas){     1 for
             //   System.out.println(linha);
        //}

            linhas.forEach(linha -> System.out.println(linha)); // 2 for

        }catch(Exception e){
            System.out.println("ocorreu um erro!");

        }

        // lidar com exceção: mais elaborado


         try{
            List<String> linhas = Files.readAllLines(arquivo);

            for(String linha : linhas){
                System.out.println(linha);
        }

        }catch(IOException e){
            System.out.println("ocorreu um erro de: " + e.getMessage());

        }
  
    }
    
}
