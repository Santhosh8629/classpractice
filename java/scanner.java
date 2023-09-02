import java.util.Scanner;  
public class ScannerExample {  
public static void main(String args[]){  
          Scanner in = new Scanner(System.in);  
          System.out.print(" Sk: ");  
          String name = in.nextLine();  
          System.out.println("Name is:");             
          in.close();             
          }  
}