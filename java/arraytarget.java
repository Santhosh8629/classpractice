public class arraytarget{
    public static void main(String args[]){
        int num[]={2,1,4,3,6,5,8,7};
        int target=15;
        int len=num.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(num[i]+num[j]==target){
                    System.out.print(i+" "+j);
                }
            }
        }
        
    }
}