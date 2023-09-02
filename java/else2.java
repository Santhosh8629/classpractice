import java.util.Scanner;
   public class else2{
     public static void main(String args[]){
     Scanner scan=new Scanner(System.in);
     int a;
     int b;
     int c;
     
     System.out.println(" ENTER A VALUE");
     a=scan.nextInt();
     System.out.println("ENTER B VALUE");
     b=scan.nextInt();
     System.out.println(" ENTER C VALUE");
     c=scan.nextInt();
     if(a>b&&a>c){
        System.out.println("A is greater");
     
        if(b>c){
            System.out.println("B second greater // C is smaller");            
        }
        else{
            System.out.println("C is second greater// B is smaller");
        }
     }
    else if(b>a&&b>c){
        System.out.println("B is greater");
    
        if(a>c){
            System.out.println(" A is second greater// C is smaller");
        }
        else{
            System.out.println("C is second greater\n A is smaller");
        }
    }
    else if(c>a&&c>b){
        System.out.println("c is greater");
         if(a>b){
            System.out.println(" A is second greater\n B smaller");
        }
         else{
            System.out.println("B is greater\n A is smaller");
        }
    }
   }

   }