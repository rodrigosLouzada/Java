import java.util.HashMap;

public class Aula48 {
    public static void main(String[] args){

        HashMap<Integer, String> carros = new HashMap<Integer,String>();

        carros.put(1, "uno");
        carros.put(2, "fiesta");
        carros.put(3, "corrola");
        carros.put(4, "hb20");

        System.out.println(carros);
        carros.remove(2);

        for(int i = 1; i < carros.size()+1; i++){
            System.out.println(carros.get(i));

        }

        for(String c : carros.values()){
            System.out.println(c);
        }

    }
    
}
