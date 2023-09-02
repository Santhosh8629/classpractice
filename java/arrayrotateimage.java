public class arrayrotateimage{
    public static void main(String args[]){
        int num[][]={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int len=num.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print(num[len-j-1][i]+" ");
            }
            System.out.println();
        }
    }
}