public class assending{
        public static void main (String args[]){
            int num[]={1,3,4,2,5,7,6,9,8};
            int len=num.length;
            int temp;
            for(int i=0;i<len;i++){
                for(int j=i+1;j<len;j++){
                    if(num[i]<num[j]){
                        temp=num[i];
                        num[i]=num[j];
                        num[j]=temp;
                    }
                }
            }
            for(int i=0;i<len;i++){
                System.out.print(num[i]);
            }
        }

}