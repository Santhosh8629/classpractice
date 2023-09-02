import java.util.Scanner;
   public class sw5{
      public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        int a;
        a=scan.nextInt();
        int action=a%100;
       switch(action){
        case 0:
            System.out.println("Divided");
            break;
        case 1:
            System.out.println("Not Divided");
            break;
       }
      }
   }
