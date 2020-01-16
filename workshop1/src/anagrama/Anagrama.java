package anagrama;
import java.util.Scanner;
public class Anagrama {
    public static void main(String[] args) {
        Scanner palabr1 = new Scanner(System.in);
        String palabra1=palabr1.nextLine();
        palabra1=palabra1.toLowerCase();
        Scanner palabr2 = new Scanner(System.in);
        String palabra2=palabr2.nextLine();
        palabra2=palabra2.toLowerCase();  
        palabr1.close();
        palabr2.close();
        if (palabra1.length()!= palabra2.length()){
            System.out.println("Not Anagrams");
            return;
        }
        for (char letra:palabra1.toCharArray()){
            long contar1 = palabra1.chars().filter(ch -> ch == letra).count();
            long contar2 = palabra2.chars().filter(ch -> ch == letra).count();
            if (contar1 != contar2){
                System.out.println("Not Anagrams");
                return;                
            }
        }
        System.out.println("Anagrams");        
    }    
}
