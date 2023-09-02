public class arraygame{
    public static void main(String args[]){
        int num[][]={{'_','_','_'},{'_','_','_'},{'_','_','_'}};
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