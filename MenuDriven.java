
package menudriven;
import java.util.*;
public class MenuDriven {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("===");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("DIV");
        System.out.println("MUL");
        
        System.out.println("Enter 2 numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter an option from the menu: ");
        String option=sc.nextLine();
        option=option.toUpperCase();
        
        switch(option){
            case "ADD": System.out.println("Sum is :"+(x+y));
            break;
            case "SUB": System.out.println("Diff is :"+(x-y));
            break;
            case "DIV": System.out.println("Div is :"+(x/y));
            break;
            case "MUL": System.out.println("Mul is :"+(x*y));
            break;
            default: System.out.println("Invalid option");
            break;
        }
    }
    
}
