import java.util.Scanner;
public class practice1{
    public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        int a;
        a=scan.nextInt();
        if(a>=18){
          System.out.println("major");
             if(a>=60){
                System.out.println("above 60 is senior citizen");
             }
        }
        else{
                System.out.println("minor and not a senior citizen");
        }
    }
        
}

        
    
