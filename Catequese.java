import java.util.Scanner;

public class Catequese {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int nota = 0;

        String[] gabarito = {"a", "b", "c","c","b"};

        String[] respostasUsuario = new String[4];

        String[] alternativas = 
        {"joao, gabriel, pedro", "7,10,9" , "francisco, urbano IV, Bento XVI",
         "Pedro, josias, jose", "jerusalem, belem, nazare"};


        String[] perguntas =
        { "quem é o discipulo amado?","quantos mandamentos Deus nos deu?",
         "Quem foi o penultimo papa?", "quem é o marido de Maria Santissima?", 
         "Onde Jesus Cristo nasceu?"};


         for(int i = 0; i < gabarito.length; i++){

            System.out.print("responda com:  a/b/c");
            System.out.println(perguntas[i]);
            respostasUsuario[i] = scan.nextLine(); 

            if(perguntas[i] == gabarito[i]){
                nota++;
            }else{
                System.out.printf("sua resposta está errada na questão %s", perguntas[i]);
            }

         }
         System.out.printf("parabéns, sua nota é %d", nota);

    }
    
}
