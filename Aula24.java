public class Aula24 {
    public static void main(String[] args){

        int [] num = new int[5];
        int [] num1 = {10,20,30,40,50};
        

        for(int i = 0; i < num1.length; i++){
            System.out.printf("%d-", num1[i]);
        }

        for(int n : num1){
            System.out.printf("%d", n);
        }

    }
    
}
