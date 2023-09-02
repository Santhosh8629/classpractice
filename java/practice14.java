import java.util.Scanner;
public class practic14{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num[]=new int[2];
        int len=num.length;
        int a=0;
        for(int i=0;i<len;i++){
            num[i]=scan.nextInt();
            a+=num[i];
        }
        System.out.println(a);

    }
}