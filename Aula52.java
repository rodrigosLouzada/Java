import java.util.ArrayList;

public class Aula52 {
    public static void main(String[] args){

        Math.min(10, 5);
        double n1 = 9;
        double n2 = 81;
        double res = Math.sqrt(n2);
        double n3 = -64;
        ArrayList<Double> resRandom = new ArrayList<Double>();
        ArrayList<Integer> res2 = new ArrayList<Integer>();

        System.out.println(Math.abs(n3));
        System.out.println(n1);

     
        
        System.out.println(Math.min(15, 80));

        for(int i = 0; i < 10; i++){
            System.out.println("começa -----------------");
            System.out.println(resRandom.add(Math.random()*100));
            System.out.println(res2.add((int) (Math.random()*10)));
            System.out.println("termina----------------------------");
        }

        for(double value : resRandom){
            System.out.println(value);
        }

        for(int value : res2){
            System.out.println(value);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(resRandom.get(i) + "-------" + res2.get(i));
        }

    }
}
