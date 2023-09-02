public class array2dmul{
    public static void main(String args[]){
        int num[][]={{1,2,3},{4,5,6}};
        int num1[][]={{1,2,3},{4,5,6}};
        int len=num.length;
        int len1=num1.length;
        int num2[][]=new int[len][len1+1];
        //int len2=num2.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len1+1;j++){
                num2[i][j]=num[i][j]*num1[i][j];
            }
        }
            for(int i=0;i<len;i++){
                for(int j=0;j<len+1;j++){
                    System.out.print(num2[i][j]+" ");
                }
                System.out.println();
        }
    }
}
