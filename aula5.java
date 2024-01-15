import java.util.Scanner;

public class aula5 {
    public static void main(String[] args){
        /* 
        for(int cont = 0; cont < 5; cont++){
            System.out.println( cont + "aula");

        } */
        
        /* 
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o máximo de vezes");
        int max = scan.nextInt();

          int cont = 0;

        while(cont < max) {

        System.out.println( (cont+1) +"- aula");
        cont ++;
        } */

        int cont = 0;

        do{
             System.out.println( (cont+1) +"- aula");
            cont ++;
        }while(cont < 0);

        System.out.println("fim de aula");
    }
}