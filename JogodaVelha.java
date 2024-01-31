import java.util.Scanner;

public class JogodaVelha {
    public static void main(String[] args){

        Campo[][] velha = new Campo[3][3];

        char simboloAtual = 'x';
        Boolean game = true;
        String vitoria = "";
        Scanner scan = new Scanner(System.in);

        while(game){

        }
    
    }

    public static void desenhaJogo(Campo[][] velha){

        System.out.println("   0   1   2");  // fazer um for pra preencher? 
        System.out.printf("0   %c |  %c |  %c %n",velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2]);
        System.out.println("-----------------");
        System.out.printf("1   %c |  %c |  %c %n",velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2]);
        System.out.println("-----------------");
        System.out.printf("2   %c |  %c |  %c %n",velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2]);



    }
}
