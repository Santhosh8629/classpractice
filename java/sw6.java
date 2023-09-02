import java.util.Scanner;
   public class sw6{
      public static void main(String args[]){
        Scanner scan=new Scanner (System.in);
        int a;
        a=scan.nextInt();
        switch(a%2){
            case 0:
                if(a%4==0){
                System.out.println("it is divided by 4");
                }              
                else{
                System.out.println("it is not divided by 4");
                }
                 case 1:
                if(a%3==0){
                System.out.println("it is divided by 3");
                }              
                else{
                System.out.println("it is not divided by 3");
                }
                }
        }
      }
   
   
        
      
   
      
   
        
      
   
        