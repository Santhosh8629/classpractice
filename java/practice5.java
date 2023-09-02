import java.util.Scanner;
    public class practice5{
        public static void main (String args[]){
            Scanner scan=new Scanner (System.in);
          
           int num[]=new int[10];
           int len=num.length;
           
            for(int i=0;i<len;i++){
               num[i]=scan.nextInt();
              
            }
             for(int i=0;i<len;i++){
               System.out.println(num[i]);
             }
                  //System.out.println(num[8]);
        }
    }
