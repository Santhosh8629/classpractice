import java.util.Scanner;
   public class sw4{
      public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        int a;
        a=scan.nextInt();
        int action=a%2;
       switch(action){
        case 0:
             System.out.println("even");
             if(a%4==0){
                 System.out.println("it divisable by 4");
             
             else(a%3==1){
                 System.out.println("it not divisable by 4");
             }
             }
        break;
        case 1:
        System.out.println("odd");
        break;
        
      }
   }
   }
