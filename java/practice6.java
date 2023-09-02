import java.util.Scanner;
public class practice7{
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        int num[]={2,1,4,3,6,5,8,7};
        //7,8,5,6,3,4,1,2
        int len=num.length;
        int temp;
        for(int i=0;i<len;i++){
            for(int j=len-1;j>i+1;j--){
              if(num[i]<num[j]){
                  temp=num[i];
                  num[i]=num[j];
                  num[j]=temp;
              }
            }
        }
        for(int i=0;i<len;i++){
        System.out.println(num[i]);
        }
    }
}