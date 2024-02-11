
package primeornot;
import java.util.*;
import java.lang.*;

public class PrimeorNot {
    
    static boolean isPrime(int n){
        for(int i=2; i<n/2; i++){
            if(n%i==0)
                return false;
        }   
        return true;
        
    }

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       int num=sc.nextInt();
       
       System.out.println(isPrime(num));
       
    }
    
}