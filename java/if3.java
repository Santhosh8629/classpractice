import java.util.Scanner;
         public class if3{
            public static void main(String args[]){
                Scanner scan=new Scanner (System.in);
                int a;
                a=scan.nextInt();
                if(a>0){
                System.out.print("the given number is positive");
                }
                if(a<0){
                System.out.print("the given number is negative");
                }
            }
         }