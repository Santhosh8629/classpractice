import java.util.Scanner;
public class pyramid1to3{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a;
        a=scan.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=i;j<=a;j++){
                System.out.print(" ");
            }
            for(int l=1;l<=i*2-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}