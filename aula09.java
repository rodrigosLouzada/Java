public class aula09 {
    public static void main(String[] args){

        msg("aula",4);
        int r = soma2(20,30);
        System.out.println(r);

        System.out.println(somaTodos(23,40,340,4,70));
        System.out.println(somaTodos(2.5, 4.5, 5.6));


    }        

    
    public static int somaTodos(int... numeros){
        int res = 0;

        for(int n : numeros){
            res += n;
        
        }

        return res;
    }


    public static Double somaTodos(Double... numeros){
        Double res = 0.0;

        for(Double n : numeros){
            res += n;
        
        }

        return res;
    }


    public static int soma2(int n1, int n2){
        int s = n1 + n2;
        return s;
    }


    public static void msg(String m, int quantidade){
        for(int i= 0; i< quantidade; i++){
            System.out.println(m);
        }

    }
}