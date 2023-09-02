public class sumoftwoarray{
    public static void main(String args[]){
        int num[]={1,2,3,4,5,6};
        int num1[]={1,2,3,4,5,6};
        int len=num.length;
        int num2[]=new int[len];
        int len1=num2.length;
        for(int i=0;i<len;i++){
            num2[i]=num[i]+num1[i];
        }
        for(int i=0;i<len1;i++){
            System.out.print(num2[i]+" ");
        }
        System.out.println();
    }
}