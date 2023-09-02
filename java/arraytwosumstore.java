import java.util.Scanner;
public class arraytwosumstore{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num[]={10,5,2,11,9,1,6,13};
        int target=19;
        int len=num.length;
        int num1[]=new int [2];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(num[i]+num[j]==target){
                    num1[0]=i;
                    num1[1]=j;
                }
            }
        }
        System.out.println(num1[0]+" " +num1[1]);
    }
}