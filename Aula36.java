import java.util.ArrayList;

public class Aula36 {
    
    public static void main(String[] args){

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>(100);

        numeros.add(11);
        numeros.add(300);
        numeros.add(400);

        carros.add("corolla");
        carros.add("uno");
        carros.add("hb20");
        carros.trimToSize();
        //carros.add(1,"BMW"); carros.clear();
        
        System.out.println(carros.get(2));
        System.out.println(carros.indexOf("hb20"));

        System.out.println(carros.remove("hb20"));
        System.out.println(carros.remove(2));



        for(int i = 0; i < carros.size(); i++){
            System.out.printf(carros.get(i));
        }


        /* 
        for(int n : numeros){
            System.out.println(n);
        }

        for(String c : carros){
            System.out.println(c);
        }
        */

        System.out.println(carros.get(2));
    }
}
