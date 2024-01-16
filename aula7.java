import java.util.Arrays;

public class aula7 {
    public static void main(String[] args){
        int[] num = {10,20,70,33,50};
        int[] numeros = new int[5];
        /* 
        for(int i = 0; i < num.length; i++){
            System.out.printf("%d", num[i]);
        } 
        Arrays.fill(numeros, 45);
        Arrays.sort(num); */
        System.arraycopy(num, 0, numeros, 0, 5);
        boolean teste = Arrays.equals(num, numeros);

        System.out.printf("arrays são iguais? %s", teste ? "sim" : "não" );

        for(int n : numeros){
            System.out.printf("%d------ ", n);
        }
    }
}
