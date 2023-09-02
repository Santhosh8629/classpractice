import java.util.Scanner;
   public class p2{
    public static void main(String args[]){
    Scanner scan=new Scanner (System.in); 
    int a;
    a=scan.nextInt();
    if(a>=0&&a<=10){
        System.out.println("true");
    }
    else{
    System.out.println("false");
    }
    }
   }