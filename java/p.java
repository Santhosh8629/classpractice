import java.util.Scanner;
   public class p{
    public static void main(String args[]){
    Scanner scan=new Scanner (System.in); 
    int a;
    a=scan.nextInt();
    if(a>0){
    System.out.println("positive");
    }
   else if(a<0){
        System.out.println("negative");
    }
    else{
    System.out.println("error");
    }
   }
   }