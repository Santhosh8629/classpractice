public class twosumfunction{
    public static void main(String args[]){
        int num[]={1,2,3,4,5,6};
        int target=11;
        twosum(num,target);
    }
    public static void twosum(int[]num,int t){
        int len=num.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(num[i]+num[j]==t){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
     
    }

    
}