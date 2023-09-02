import java.util.Scanner;
   public class sw1{
      public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        int a;
        int b;
        int c;
        int d;
            String action=scan.nextLine();
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        d=scan.nextInt();
        
        switch(action){
            case "add":
            System.out.println("VALUE IS:"+(a+b+c+d));
            break;
            case "sub":
            System.out.println("VALUE IS:"+(a-b-c-d));
            break;
            case "mul":
            System.out.println("VALUE IS:"+(a*b*c*d));
            break;
            case "div":
            System.out.println("VALUE IS:"+(a%b%c%d));
            break;
            default:
        }
      }
   }
        