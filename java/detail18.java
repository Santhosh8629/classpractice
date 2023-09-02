import java.util.Scanner;
public class detail18{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("ENTER A GENDER");
    char gender=scan.next().charAt(0);

       if(gender=='M'||gender=='m'){
        int mark;
        System.out.print("ENTER A MARK");
        mark=scan.nextInt();
        if(mark>=70){
            System.out.print("eligible");
        }
        else{
            System.out.print("not eligible");
        }
        

    
       }
    }
}
    