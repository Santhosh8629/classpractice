public class else1{
    public static void main(String args[]){
        int a= 10;
        int b=20;
        int c=30;
        if(a>c&&a>b){
            System.out.println("a is greater");
         
            if(b>c){
                System.out.println("b is second greater");    
            }
            
            else{
                System.out.println("c is smaller");
            }
        }
        else if(a<c&&a<b){
            System.out.println("a is lesser");
         
            if (b<c){
                System.out.println("b is second lesser");
            }
            
        else{
            System.out.println("false");
        }
        }
    }
}