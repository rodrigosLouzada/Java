import java.util.ArrayList;

public class Aula37 {
    
    public static void main(String[] args){

        ArrayList<String> carros = new ArrayList<>(100);

        carros.add("corolla");
        carros.add("uno"); 
        carros.add("hb20");

        try{ 
            System.out.println(carros.get(1));
        }catch(Exception e){
           // System.out.println("erro");
           System.out.println("ERRO" + e.getMessage());

        }catch(InternalError a){
            System.out.println("erro interno");

        }catch(InstantiationError e){
            System.out.println("erro de classe e instancia");

        }finally{
            System.out.println("fim do try");
        }
        
    }
}
