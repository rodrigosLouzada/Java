public class Aula39 {
    public static void main(String[] args){

        char [] texto = {'J', 'A', 'V', 'A'};
        String texto1 = new String("Java");
        char[] teste = new char[texto.length];

        String texto2 = "..................";

        String t = "java";    //String texto1 = new String("Java");

        /* 
        	char[] texto;
                
        	char[] texto = {'a', 'b'};
            String texto;
            String texto2 = texto;
        
            String texto = new String(); 
            String texto1 = new String(texto); 
                */

        String s1 = new String();
        String s2 = new String(texto1);
        String s3 = new String(texto);
        String s4 = new String(texto, 0, 2);

         texto1.getChars(0, 3, teste, 0);

        System.out.println("o novo texto é: " + teste);

        

        System.out.println("o tamanho deste texto é: " + texto1.length());
        System.out.println("o char dessa posição é: " + texto1.charAt(2));
        System.out.printf(s4);
    }
    
}
