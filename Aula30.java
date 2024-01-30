import java.util.Arrays;

public class Aula30 {
    public static void main(String[] args){

        int[] num = {3,4,1,5,10,49,4,5,94};
        int[] num2 = new int[10];
        int[] num3 = {3,4,1,5,10,49,4,5,94};
        int[] num4 = {3,4,21,35,150,49,4,40,94};

        int n = 77;
        int pos = Arrays.binarySearch(num, n);
        Arrays.sort(num);
        System.out.printf("o numero %d está no array? : %s", n , pos > -1 ? "sim" : "não" );

        /* 
        System.out.printf("os arrays são: %s%n", Arrays.equals(num3, num4) ? "iguais" : "diferentes");
        System.out.printf("os arrays são: %s%n", Arrays.equals(num, num3) ? "iguais" : "diferentes"); */

       /* Arrays.sort(num);
        Arrays.fill(num2, 10000);
        System.arraycopy(num, 0, num2, 0, num.length);

        for(int n : num){
            System.out.printf("%d%n", n);
        } */
    }
    
}
