/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchMethods;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class SearchMethods {
    static int a;
    static int b;
    static int c;
    static String phrase;
    
    public static Integer minNumber() {
        int min = 2140000;
        if (min>a) {
            min=a;
        }
        if (min>b) {
            min=b;
        }
        if (min>c) {
            min=c;
        }
      
        return min;
    }
    
    public static double avgNumber() {
       double average = (a + b + c) / 3;
        
        return average;
    }
    
    public static Integer wordCount(){
        int count = 0;
        char[] array = phrase.toCharArray();
        
        for (int i = 0; i<array.length;i++) {
            if (array[i] == ' ') {
                count++;
            }
        }
        
        return count;
    }
    
    
    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println("Min number is = " + minNumber());
        System.out.println("Average number is = " + avgNumber());
        System.out.println("Enter your phrase");
        phrase = in.next();
        System.out.println("Your phrase has " + wordCount() + " words");
        
        
        
        
        
    }
    
}
