import java.util.Scanner;
public class t12{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        int a;
        int b;
        int c;
        
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        if(a>b&&a>c){
            System.out.println("a is gretest");
        }
        else if(b>a&&b>c){
            System.out.println("b is second gretest");
        }
        else{
            System.out.println("c is third gretest");
        }


    }
}