import java.util.Scanner;
public class game1{
    Scanner scan=new Scanner(System.in);
    public static void main(String args[]){
        char num[][]={{'_','_','_'},{'_','_','_'},{'_','_','_'}};
        int len=num.length;
        for(int i=0;i<len;i++){
            System.out.print(" | ");
            for(int j=0;j<len;j++){
                System.out.print(num[i][j]+" | ");
            }
            System.out.println("\n");
        }
    }
}