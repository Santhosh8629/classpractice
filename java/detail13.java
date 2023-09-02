import java.util.Scanner;
public class detail13{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER A CHARACTER");
        char a;
        a=scan.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
        System.out.println("a is vowels");
        }
        else if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
        System.out.println("A wovels");
        }
        else{
            System.out.print("not a wovels");
        }
    }
}
    