import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();

        System.out.printf("%nDigite um valor: ");
        n1.setValor(scan.nextInt());
        System.out.printf("%nDigite um valor: ");
        n2.setValor(scan.nextInt());
        res.setValor(n1.getValor() + n2.getValor());
        System.out.printf("%nA soma de %d com %d é igual a %d", n1.getValor(), n2.getValor(), res.getValor());

        
    }
    
}
