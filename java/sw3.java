import java.util.Scanner;
   public class sw3{
      public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        int a;
        a=scan.nextInt();
    
        switch(a){
            case 2:
            System.out.println("even");
            break;
            case 3:
            System.out.println("odd");
            break;
            default:
        }
      }
   }