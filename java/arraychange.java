public class arraychange{
    public static void main(String args[]){
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        int len=num.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print(num[len-j-1][i]+" ");
            }
            System.out.println();
        }
    }
}