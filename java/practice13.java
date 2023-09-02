import java.util.Scanner;
public class practic13{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num[]=new int[5];
        int len=num.length;
        for(int i=0;i<len;i++){ 
            num[i]=scan.nextInt();
        }
        for(int i=0;i<len;i++){ 
            System.out.print(num[i]);
        }
       

    }
}