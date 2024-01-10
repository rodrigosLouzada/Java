public class aula2 {
    public static void main(String[] args){

        int nota = 65;
        int media = 60;
        int faltas = 30;
        int faltasMax = 10;
        String res;

        int pos = 5;

        switch (pos) {
            case 1 :
                System.out.println("primeiro");
                break;
            case 2 :
                System.out.println("segundo");
                break;
            case 3 :
                System.out.println("terceiro");
                break;
            default:
                System.out.println("Não subiu ao podio");
        }


        res = (nota >= media ? "aprovado" : "repovado");
            System.out.println("resultado" + res);


        if(nota >= media && faltas <= faltasMax){
            System.out.println("aprovado");

        }else if(nota >= 40) {
            System.out.println("recuperacao");

        }else{
            System.out.println("reprovado");
        }

        System.out.println("fim do programa");
    }
}