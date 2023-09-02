import java.util.Scanner;
public class detail15ternary{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER A VALUE");
        int num=scan.nextInt();
        String str=(num>=18)?"major":"minor";
        System.out.print(str);
    }
}