import java.util.Scanner;
public class arraytotal{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num[]={1,2,3,4,5};
        int len=num.length;
        int a=0;
        for(int i=0;i<len;i++){
            a+=num[i];
        }
        System.out.println(a);
    }
}