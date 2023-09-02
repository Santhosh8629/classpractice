import java.util.Scanner;
public class emptyarray{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER A VALUE");
        String num[]=new String[5];
        for(int i=0;i<num.length;i++){
            num[i]=scan.nextLine(); 
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
      
    }
}