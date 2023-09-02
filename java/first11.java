public class first11{
    public static void main(String args[]){
        int num[]={1,7,10,20,7,8,9};
        int target=14;
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