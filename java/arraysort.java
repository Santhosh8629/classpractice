import java.util.Arrays;
public class arraysort{
    public static void main(String args[]){
        String num[]={"dogis","mnlk","Arun","zero","aarun"};
        Arrays.sort(num);
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
        // int len=num.length;
        // String temp;
        // for(int i=0;i<len;i++){
        //     for(int j=i+1;j<len;j++){
        //         if(num[i]>num[j]){
        //             temp=num[i];
        //             num[i]=num[j];
        //             num[j]=temp;
        //         }
        //     }
        // }
        // for(int i=0;i<len;i++){
        //     System.out.println(num[i]);
        // }

 
    }
}