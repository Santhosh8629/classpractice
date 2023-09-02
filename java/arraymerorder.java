public class arraymerorder{
    public static void main(String args[]){
        int num[]={1,7,5,2,7};
        int num1[]={9,3,4,6,9};
        int len=num.length;
        int len1=num1.length;
        int num2[]=new int[len+len1];
        int len2=num2.length;
        int mid=len2/2;
        int temp;
        int k=0;
        for(int i=0;i<len2;i++){
            if(len>i){
                num2[i]=num[i];
            }
            else{
                num2[i]=num1[k];
                k++;

            }
        }
        
        for(int i=0;i<len2;i++){
            for(int j=i+1;j<len2;j++){
                if(num2[i]>num2[j]){
                    temp=num2[i];
                    num2[i]=num2[j];
                    num2[j]=temp;                
                }
            }
        }
      
        if(len2%2==0){
            System.out.println((float)(num2[mid-1]+num2[mid])/2);
        }
        else{
            System.out.println(num2[mid]);
        }





    }
}