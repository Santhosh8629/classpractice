import java.util.Scanner;
public class functionloop{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
         System.out.println(" ENTER A VALUE");
        int num=scan.nextInt();
        pattern(num);
       
    }
        public static void pattern(int a){
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
