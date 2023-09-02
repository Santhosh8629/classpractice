public class arrayreverse{
    public static void main(String args[]){
        int num[]={2,1,4,3,6,5,8,7};
        int len=num.length;
        int temp;
        for(int i=0;i<len/2;i++){
            temp=num[i];
            num[i]=num[i-7];
            num[i]=temp;        
        }
        for(int i=0;i<len;i++){
            System.out.print(num[i]);
        }
    }
}