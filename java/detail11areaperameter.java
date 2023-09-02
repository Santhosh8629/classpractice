import java.util.Scanner;
public class detail11areaperameter{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a;
        System.out.println("ENTER A VALUE");
        a=scan.nextInt();
        int b;
        System.out.println("ENTER B VALUE");
        b=scan.nextInt();
        int c;
        System.out.println("ENTER C VALUE");
        c=scan.nextInt();
        int d;
        System.out.println("ENETER D VALUE");
        d=scan.nextInt();
        System.out.println("VALUE IS "+(float)b*d/2);
        System.out.println("VALUE IS "+(a+b+c));
        
    }
}