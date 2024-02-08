public class Aula42 {
    public static void main(String[] args){
        String s1 = "curso java";
        System.out.println(s1);
        String s2 = "JAVA";
        int pos = s1.indexOf("j");
        String dog = "dinho é ";

        System.out.println(s2.replace("A", "@"));
        System.out.println(s1.toLowerCase() + "--------"+ s2.toUpperCase());
        System.out.println(s1.toCharArray());
        System.out.println(dog.trim());
        String[] s5 = s1.split(" ");

        for(String s : s5){
            System.out.println(s);
        }
 
    }
    
}
