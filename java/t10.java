import java.util.Scanner;
 public class t10{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        int a;
        int b;
        a=scan.nextInt();
        b=scan.nextInt();
        if(a>b){
            System.out.println("greatest number is"+a);

    }
        else{
            System.out.println("greatest number is"+b);
        }
    }
 }