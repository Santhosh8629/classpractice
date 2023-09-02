import java.util.*;
public class detailpredefine{
    public static void main(String args[]){
        int arr[]={11,22,33,44,55,66,77};
        int value=44;
        int index=search(arr,value);
        System.out.println("ind "+index);
        
    }
    public static int search(int num[],int val){
       Arrays.sort(num);
       for(int a:num){
        System.out.println(a);
       }
       int i=Arrays.binarySearch(num,val);
       return i;
     

    }
    
    
}