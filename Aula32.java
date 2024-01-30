import java.security.SecureRandom;

public class Aula32 {
    public static void main(String[] args){

        final int linha = 3;
        final int coluna = 5;

        int[][] numeros = new int[linha][coluna];

        for(int l = 0; l<linha ; l++){
            for(int c = 0; c < coluna; c++){
                numeros[l][c] = new SecureRandom().nextInt(100);

            }
        }

        for(int l = 0; l<linha ; l++){
            for(int c = 0; c < coluna; c++){
                System.out.printf("%d", numeros[l][c]) ;

            }
        }
        
    }
}
