public class Aula38 {
    
    public static void main(String[] args){

        int[] notas = {30,40,70,80};


        for(int n : notas){
            if(n < 50){
                throw new IndexOutOfBoundsException("notas acima de 50");
            }else{
                System.out.println(n);
            }
        }

        int nota1,nota2,res;
        nota1 = 60;
        nota2 = 30;

        if(nota1 > 50){
            throw new IllegalArgumentException("valor da nota acima de 50");
        }
        if(nota2 > 50){
        throw new IllegalArgumentException("valor da nota acima de 50");
 
        }
        res = nota1 + nota2;
        System.out.println("resultado: " + res);
        
    }
}