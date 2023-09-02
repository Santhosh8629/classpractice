import java.util.Scanner;
public class t11{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a;
        int b;
        System.out.println("enter value");
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println((a*a)+(b*b)+(2*a*b));
    }
}