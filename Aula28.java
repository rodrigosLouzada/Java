public class Aula28 {
    public static void main(String[] args){
        int[] notas = {44, 60, 59, 50, 90, 60, 70, 40, 60, 90};
        int aprov = 0, reprov = 0;
        int[] resultado = {0,0};

        conferirNotas(notas, aprov, reprov);

        /*  c++ funcionaria, ele só altera a valor da copia, não o original
        System.out.printf("Aprovados %d",aprov);
        System.out.printf("Reprovados %d",reprov); */

        conferirNotas2(notas,resultado);
        System.out.printf("Aprovados %d",resultado[0]);
        System.out.printf("Reprovados %d",resultado[1]);


    }
    
    public static void conferirNotas(int[] nota, int aprov, int reprov){
        for(int n: nota){
            if(n >= 60){
                aprov++;
            }else{
                reprov++;
            }
        }
        System.out.printf("Aprovados %d",aprov);
        System.out.printf("Reprovados %d",reprov);

    }


    public static void conferirNotas2(int[] nota, int resultado[]){
        for(int n: nota){
            if(n >= 60){
                resultado[0]++;
            }else{
                resultado[1]++;
            }
        }
}
