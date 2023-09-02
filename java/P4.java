import java.util.Scanner;
public class p4{
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        
        char a;
       a=scan.next().charAt(0);
         if((a>='a'&&a<='z')||(a>='A'&&a<='Z')){
            System.out.println("is it albapet");
         }
         else if(a>='0'&&a<='9'){
                System.out.println("is it numbers");
         }
         else{
            System.out.println("is it special characters");
         }
        
    }
 }