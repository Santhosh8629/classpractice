import java.util.Scanner;
public class arrayTF{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num[]={1,2,3,4,5,6,7,8,9,10};
    int len=num.length;
    int num1=9;
    int a=0;
    for(int i=1;i<len;i++){
        if(num[i]==num1){
            a++;
        }
    }
        if(a>0){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
