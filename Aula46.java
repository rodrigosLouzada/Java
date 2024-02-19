import java.util.Stack;

public class Aula46 {
    public static void main(String[] args){

        Stack <String> carros = new Stack<>();

        carros.push("corolla");
        carros.push("hb20");
        carros.push("ford");
        carros.push("camaro");
        carros.push("opalla");

        System.out.println("o elemento do topo da pilha é:" + carros.peek());
        System.out.println("o elemento de topo da pilha retirado é : " + carros.pop());

        System.out.println(carros);

        for(String c : carros){
            System.out.println(c);

        }

        if(carros.empty()){
            System.out.println("está vazia");
        }else{
            System.out.println("não está vazia");
        }

    }
    
}
