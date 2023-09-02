import java.util.Scanner;
public class arraybigvalue{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num[]={1,2,3,4,5};
        int len=num.length;
        int a=0;
        for(int i=1;i<len;i++){
            if(a<num[i]){
              a=num[i];
            }   
        }
        System.out.println(a);


    }
   
}