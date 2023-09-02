import java.util.Scanner;
public class lt22{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER A VALUE");
        int a;
        a=scan.nextInt();
        for(int i=1;i<=a;i++){
        for(int j=i;j<=a;j++){
            System.out.print(" ");
        }
        for(int k=i;k>=1;k--){
            System.out.print(k);
        }
        for(int l=2;l<=i;l++){
        System.out.print(l);
        }
        System.out.println();
        }


      

    }

}