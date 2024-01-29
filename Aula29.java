import java.util.Scanner;

public class Aula29 {
    public static void main(String args){
        int[] valores = {20,40,50};
        

        SomarValores(valores);
        SomarValores2(valores);

    }


    public static int SomarValores(int [] valores){
        int res = 0;
        for(int valor: valores){

            res+= valor;
        }
        return res;
    }

    public static int SomarValores2(int... valores){
        int res = 0;
        for(int valor: valores){
            res += valor;

        }
        return res;
    }

    public static int SomarValores3(){
        Scanner scanner = new Scanner(System.in);
        int respostasUsuario = 0;
        String respSN = "";

        do{
        System.out.println("você quers somar números, 'sim' ou 'não'?");
        respSN = scanner.nextLine();
        respostasUsuario += scanner.nextInt();
        

        }while(respSN.equals("sim"));
        
    }
    
}
