import java.util.Scanner;

public class aula3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        double res = 0;
        final int media = 60;
        String nome = "";

        System.out.println("Digite um nome:");
        nome = scan.nextLine();

        System.out.println("Digite sua nota:");
        n1 = scan.nextInt();
        System.out.println("digite sua nota:");
        n2 = scan.nextInt();
        res = (n1 + n2)/2;

        //  System.out.printf("%s A soma de %d com %d é de %d",nome ,n1,n2,res);


        if(res >= media){
            System.out.printf("aluno:%s está aprovado com média de %.2f. ", nome, res);

        }else{
            System.out.printf("aluno:%s está reprovado com média %.2f.", nome, res);
        }
    }
}