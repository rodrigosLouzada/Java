public class Aula40 {
    public static void main(String[] args){

        String s1 = new String("dinho");
        String s2 = "dinho";
        String s3 = "Curso de java";
        String s4 = "curso JAVA";
        String s5 = "curso java";

        System.out.println(s2);

        if(s4.regionMatches(true, 0, s5, 0, 9)){
            System.out.println("são iguais");
        }else{
            System.out.println("não são iguais");
        }
         
        System.out.println(s1.compareTo(s3));
        int pos = s2.compareTo(s1);
        System.out.println(pos);

        if(pos == 0){
            
        }if(pos < 1){

        }else{
        }

        if(s1 == s2){
            System.out.println("s1 e s2 são iguais");
        }else{
            System.out.println("s1 e s2 não são iguais");
        }

        if(s1.equals(s2)){
            System.out.println("s1 e s2 são iguais");
        }else{
            System.out.println("s1 e s2 não são iguais");
        }

        if(s4.equalsIgnoreCase(s5)){
            System.out.println(" iguais");
        }else{
            System.out.println("não são iguais");
        }

       
    } 
    
}
