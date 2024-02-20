import java.util.Iterator;
import java.util.ArrayList;

public class Aula50 {
  public static void main(String[] args){

        ArrayList<String> carros = new ArrayList<String>();

        carros.add("hrv");
        carros.add("corolla");
        carros.add("civic");
        carros.add("hb20");

        System.out.println(carros);

        Iterator<String> it = carros.iterator();

        while(it.hasNext()){
            String c = it.next();
            if(c == "hrv"){
                it.remove();
            }
        }
        System.out.println(carros);



    }
    
}
