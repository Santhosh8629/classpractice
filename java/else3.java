import java.util.Scanner;
public class else3{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
      char gender='m';
      
        int age;
        float hemo;
   
    System.out.println("Enter a age");
    age=scan.nextInt();
    System.out.println("Enter a hemoglobin");
    hemo=scan.nextFloat();
    

    if(gender=='F'||gender=='f'){
        System.out.println("Enter a Gender");
    
         if(age>=12&&age<=18){
            System.out.println("Enter a Female age");
            if(hemo>=12.0&&hemo<=16.0){
                System.out.println(" a normal ");
            }  
           
            else{
            System.out.println("abnormal");
            }
         }
        else{
            System.out.println("Enter a Female 1 age");
        if(hemo>=12.1&&hemo<=15.1){
                    System.out.println("  normal");
            }
            else{
                System.out.println(" abnormal");
            }
        
        }
}
    else if(gender=='M'||gender=='m'){
            System.out.println("Enter a gender ");
            if(age>=12&&age<=18){
                System.out.println("Enter a male age");
            
                if(hemo>=13.0&&hemo<=16.0){
                    System.out.println("normal");
                }
                else{
                    System.out.println("abnormal");
                }
            }
    
        else{
                System.out.println("Enter a male1 age");
                if(hemo>=13.6&&hemo<=17.7){
                    System.out.println("Normal");
                }
                else{
                    System.out.println("Abnormal");
                }
        }
        
}
}
}


   