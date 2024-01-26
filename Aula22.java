public class Aula22 {
    public static void main(String[] args){
        int posicao = 1;
        int valor = 1;


        switch (posicao) {
            case 1:
                System.out.printf("o premio é o ouro para: $s%n", posicao); 
                break;

            case 2:

                System.out.printf("o premio é o prata para: $s%n", posicao);
                break;

            case 3:
                System.out.printf("o premio é o bronze para: $s%n", posicao);

                break;
        
            default:

                System.out.printf("não há premio: $s%n", posicao);
                break;
        }

        switch (valor) {
            case 1: case 2: case 3:
                System.out.printf("o valor %d é baixo", valor);
                break;
        
            default:
                System.out.printf("o valor %d é alto", valor);
                break;
        }
    }
    
}
