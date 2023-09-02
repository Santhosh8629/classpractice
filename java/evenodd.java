public class evenodd{
    public static void main(String args[]){
        int num[]={1,2,3,4,5,6,7,8,9,10};
        int len=num.length;
        for(int i=0;i<len;i++){
            if(num[i]%2==0){
                System.out.println(num[i]);
            }
        }
    }
}