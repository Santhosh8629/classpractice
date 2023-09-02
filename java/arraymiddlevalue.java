public class arraymiddlevalue{
    public static void main(String args[]){
        int num[]={1,2,3,4,5,6,7};
        int len=num.length;
        int mid=len/2;
        if(len%2==0){
            System.out.println((float)(num[mid-1]+num[mid])/2);
        }
        else{
            System.out.println(num[mid]);
        }
        //System.out.println((num[mid-1]+" "+num[mid]));
        //System.out.println((float)(num[mid-1]+num[mid]));  
    }
}  

            
    
    
         





    