import java.util.HashSet;

public class Aula49 {
    public static void main(String[] args){

        HashSet<String> carros = new HashSet<>();

        carros.add("hrv");
        carros.add("corolla");
        carros.add("civic");
        carros.add("hb20");

        System.out.println(carros.add("corolla")? "sim" : "não");
        System.out.println(carros.contains("hrv")? "sim" : "não");
        System.out.println(carros.remove("civic"));


    }
    
}
