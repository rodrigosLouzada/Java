public class Aula27 {
    public static void main(String[] args){
        String nome = "Rodrigo";
        int[] numeros = {10,33,44,50,90};

        for(char c : nome.toCharArray()){
            System.out.printf("%c", c);
        }



        for(int n : numeros){
            if(n%2 == 0){
                System.out.printf("o número %d é par", n);
            }else{
                System.out.printf("o número %d é par", n);

            }

        };

    }

    public static void parImpar(int[] num){
        for(int n : num){
            if(n%2 == 0){
                System.out.printf("o número %d é par", n);
            }else{
                System.out.printf("o número %d é par", n);

            }

        };

    }
    
}
