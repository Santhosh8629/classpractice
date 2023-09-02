import java.util.Scanner;
public class function{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int num1=scan.nextInt();
    System.out.print(add(num,num1));
    }
    public static int add(int num,int num1){
    return num+num1;
    }
}