import java.util.Scanner;
public class lt12{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a;
        System.out.println("ENTER A VALUE");
        a=scan.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}