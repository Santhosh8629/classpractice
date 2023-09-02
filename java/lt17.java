import java.util.Scanner;
public class lt17{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a;
        System.out.println("ENTER A VALUE");
        a=scan.nextInt();
        for(int i=a;i>=1;i--){
            for(int j=i;j<=a;j++){
                System.out.print(" ");
            }
            for(int s=1;s<=i*2-1;s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}