public class Aula41 {
    public static void main(String[] args){

        String s1 = "curso java";
        System.out.println(s1);
        String s2 = "JAVA";
        int pos = s1.indexOf("j");
        String dog = "dinho é ";

        System.out.println(dog.concat(s2));
        System.out.println(s1.substring(7));

        if(s1.startsWith("cur") && s1.endsWith(s2.toLowerCase())){
            System.out.println("são iguais");
        }else{         
            System.out.println("são diferentes");

        }

        switch (pos) {
            case 0 : case 1:

            System.out.println("são as primeiras posiçoes");

            break;

            case 5 : case 6 :

            System.out.println("está além da metade");


            break;
        
            default:
            System.out.println("além do limite");

                break;
        }

    }
    
}
