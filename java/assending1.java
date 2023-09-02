public class assendin1{
    public static void main(String args[]){
        int num[]={2,1,4,3,6,5,8,7};
        int len=num.length;
        int temp;
        for(int k=0;k<len;k++){
            for(int l=k+1;l<len;l++){
                if(num[k]<num[l]){
                    temp=num[k];
                    num[k]=num[l];
                    num[l]=temp;
                }
            }
        }
        for(int k=0;k<len;k++){
            System.out.print(num[k]);
        }
    }
}