import java.util.LinkedList;
import java.util.Queue;

public class Aula47 {
    public static void main(String[] args){

        Queue<String> carros = new LinkedList<>();


        carros.add("corolla");
        carros.add("hb20");
        carros.add("ford");
        carros.add("camaro");
        carros.add("opalla");


        System.out.println("o topo da fila é: " + carros.peek());
        System.out.println("o elemento do topo eliminado na fila é : " + carros.poll());

        System.out.println(carros.isEmpty()? "a fila está vazia" : "há elementos na pilha");

        if(!carros.isEmpty()){
            for(String c : carros){
                System.out.println(c);
            }
        }

    }  
}
