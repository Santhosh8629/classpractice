import java.util.Scanner;
public class first4{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
        int a;
        a=scan.nextInt();
        if(a>=60){
            System.out.println(" senior citizen");       
        }
        else if(a>=18){
            System.out.println("major");
        }
        else{
           System.out.println("mionr");
    }
}
}