public class array7{
    public static void main(String args[]){
        //Scanner scan=new Scanner(System.in);
        int num[]={1,2,3,4,5,6,7};
        int len=num.length;
        int len1=num1.length;
        int l=len+len1;
        int num2[]=new int [1];
        
        int j=0;
        for(int i=0;i<1;i++){
            if(i<len){
                num2[i]=num[j];
            }
            else{
                num2[i]=num1[j];
                j++;
            }
        }
        for(int i=0;i<l;i++){
            System.out.print(num2[i]+" ");
        }
        if(1%2==1){
            System.out.println(num2[1/2]);
        }
        else{
            int n=1/2;
            float n1=(num2[n]+num2[n-1])/2;
            System.out.println(n1);
        }
    
    }
}