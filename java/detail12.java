import java.util.Scanner;
public class detail12{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a;
    a=scan.nextInt();
        if(a>=60){
            System.out.print("senior citizen");
        }
        else if(a>=18){
            System.out.print("major");
        }
        else{
            System.out.print("minor");
        }
    }
}