import java.util.Scanner;
 public class if7{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a;
    int b;
    a=scan.nextInt();
    b = scan.nextInt();
    if(a%b==1){
        System.out.println("the remainder number is 1");
    }
    else{
        System.out.println("the remainder is 0");
    }
    }
 }