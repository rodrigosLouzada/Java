import java.nio.file.*;

public class Aula43 {
    public static void main(String[] args){
        
        Path diretorio = Paths.get("C:\\Users\\natal\\Documents\\javaEstudos");
        Path arquivo = Paths.get("C:\\Users\\natal\\Documents\\javaEstudos\\Animal");

        if(Files.isDirectory(diretorio)){
            System.out.println("existe o diretorio");
            
        }if(Files.isDirectory(diretorio) == false){
        System.out.println(" Não existe o diretorio");

        }if(Files.exists(arquivo)){
            System.out.println("existe o arquivo");

        }else if(Files.exists(arquivo) == false){
            System.out.println("arquivo não existe");
        }

    }
}
