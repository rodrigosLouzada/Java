public class Soma {
    public static void main(String[] args){

        int soma = 0;

        if(args.length <= 0){
            System.out.printf("%s", "sem valores para soma");
        }

        for(String n : args){
            int v = Integer.valueOf(n);
            soma += v;
        }

        System.out.printf("os valores da soma: %d%n", soma);

    }
    
}
