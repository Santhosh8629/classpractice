import java.util.Scanner;
public class lt19{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a;
        System.out.println("ENTER A VALUE");
        a=scan.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=i;j<=a;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}