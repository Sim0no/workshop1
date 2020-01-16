/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;

import java.util.Scanner;

/**
 *
 * @author 2152805
 */
public class Anagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner palabr1 = new Scanner(System.in);
        String palabra1=palabr1.nextLine();
        palabra1=palabra1.toLowerCase();
        Scanner palabr2 = new Scanner(System.in);
        String palabra2=palabr2.nextLine();
        palabra2=palabra2.toLowerCase();
        
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
