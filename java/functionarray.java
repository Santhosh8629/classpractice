public class functionarray{
    public static void main(String args[]){
        int num[]={1,2,3,4,5,6};
        int num1[]=decending(num);
        for(int i=0;i<num1.length;i++){
        System.out.print(num1[i]);  
        }
    }
    public static int[] decending(int[] num){
        int len=num.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp=0;
                if(num[i]<num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        return num;
        //for(int i=0;i<len;i++){
          //  System.out.print(num[i]);
        //}
    }
}
