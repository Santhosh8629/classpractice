import java.util.Scanner;
 public class p3{
    public static void main (String args[]){
        Scanner scan=new Scanner (System.in);
        char a;
        a=scan.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
        System.out.println("a is vowels");
        }
        else if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
        System.out.println("A wovels");
    }
    else{
    System.out.println("not vowels");
    }
    }
    }
 