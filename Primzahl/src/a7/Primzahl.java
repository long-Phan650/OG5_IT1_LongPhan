package a7;
import java.util.*;


public class Primzahl {
	
public static void main(String[] args) {
	
	
    Scanner scan = new Scanner(System.in);
    

    System.out.print("Geben Sie eine ganze Zahl (long) ein: ");
    long x = scan.nextLong();
    long anfang = System.currentTimeMillis();
      
    
    boolean istPrimzahl = true;
    
            if (x <= 1) {
        istPrimzahl = false;
    } else {
        
        for (long i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
               
                istPrimzahl = false;
                break; 
            }
        }
    }
           
    
    if (istPrimzahl) {
        System.out.println(x + " ist eine Primzahl.");
    } else {
        System.out.println(x + " ist keine Primzahl.");
    }
        long ende = System.currentTimeMillis();
        System.out.println(ende - anfang +"ms");
    }
    
}


