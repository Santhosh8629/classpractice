public class array2add{
    public static void main(String args[]){
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        int num1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int len=num.length;
        int len1=num1.length;
        for(int i=0;i<len;++i){
            for(int j=0;j<len1;++j){
                System.out.println(num[i][j]+num1[i][j]);
            }
        }
    }
}
