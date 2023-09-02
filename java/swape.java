import java.util.Scanner;
public class swape{
    public static void main(String args[]){
     Scanner scan=new Scanner(System.in);
        int num[]={1,2,3,4,5,};
        int len=num.length;
        int temp;
        for(int i=0;i<len/2;i++){
            temp=num[i];
            num[i]=num[4-i];
            num[4-i]=temp; 
        }
          for(int i=0;i<len;i++){
           System.out.println(num[i]);
        }
        }
     
    }





