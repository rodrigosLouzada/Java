import java.util.Scanner;

public class aula6 {
    public static void main(String[] args){
        /* 
        int[] num = new int[4];
        num[0]= 5;
        num[1] = 10;
        num[2] = 15;
        num[3] = 20;

        int[] numeros = {10,40,50};
        /* 
        System.out.printf(" %d", numeros[0]);  
        

        for(int i = 0; i < num.length; i++){
            System.out.printf("sua coleção de números é: %d  --", num[i]);
        }  
        */

        char[] gabarito = {'a', 'b', 'c', 'a','a'};

        Scanner scan = new Scanner(System.in);
        String[] respotas = new String[5];

        for(int i = 0; i < gabarito.length; i++){

        System.out.println("digite a letra de sua respota");
        String respostaUsuario = scan.nextLine();
        respotas[i] = respostaUsuario;
    
        }

    } 
}
