import java.util.Scanner;
public class arraytwosum{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("VALUE IS");
    int num[]={10,5,2,11,9,1,6,13};
    int target=19;
    int len=num.length;
    for(int i=0;i<len;i++){
        for(int j=i+1;j<len;j++){
            if(num[i]+num[j]==target){
                
                System.out.println(i);
                System.out.println(j);
            }
        }    
    }
    }
}
       
