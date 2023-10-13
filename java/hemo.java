import java.util.Scanner;
public class hemo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a gender");
        char gender=scan.next().charAt(0);
        if(gender=='C'||gender=='c'){
        System.out.println(" a child");
        int month;
        System.out.println("Enter a month");
        month=scan.nextInt();
        System.out.println("Enter a age");
        int age;
        age=scan.nextInt();
        System.out.println("Enter a hemo");
        float hemo;
        hemo=scan.nextFloat();
            if(month<=1){
                if(hemo>=1010&&hemo<20&&age<=1){
                    System.out.println("hemo level normal");
                }
                else{
                    System.out.println("hemo level abnormal");
                }
            }
            else if(month>1&&month<=2&&age<=1){
                
                if(hemo>=10&&hemo<18){
                    System.out.println("hemo lev normal");
                }
                else{
                    System.out.println("hemo lev abnormal");
                }
            }
            else if(month>=2&&month<6&&age<=1){
                System.out.println("Enter a child month");
                if(hemo>=9.5&&hemo<14){
                    System.out.println("hemo lev normal");
                }
                else{
                    System.out.println("hemo lev abnormal");
                }
            }
            else if(month>=6&&age<=2){
                
                if(hemo>=10.5&&hemo<13.5){
                    System.out.println("hemo lev normal");
                }
                else{
                    System.out.println("hemo lev abnormal");
                }
            }
            else if(age>=2&&age<6){
                
                if(hemo>=11.5&&hemo<13.5){
                    System.out.println("hemo lev normal");
                }
                else{
                    System.out.println("hemo lev abnormal");
                }
            }
            else{
                
                if(hemo>=11.5&&hemo<15.5){
                    System.out.println("hemo lev normal");
                }
                else{
                    System.out.println("hemo lev abnormal");
                }
            }
      
            
        }
        else if(gender=='F'||gender=='f'){
             System.out.println("Enter a age");
        int age;
        age=scan.nextInt();
         System.out.println("Enter a hemo");
        float hemo;
        hemo=scan.nextFloat();
            System.out.println("enter a gender");
            if(age>=12&&age<18){
                 System.out.println("enter a age");
                if(hemo>=12&&hemo<=16){
                    System.out.println("hemo lev normal");
                }
                else{
                     System.out.println("hemo lev normal");          
            }
            }
            else if(age>=18){
                System.out.println("enter a age");
                if(hemo>12.1&&hemo<15.1){
                    System.out.println("hemo lev normal");
                }
                else{
                     System.out.println("hemo lev abnormal");
                }
            }
        }
        else if(gender=='M'||gender=='m'){
             System.out.println("Enter a age");
        int age;
        age=scan.nextInt();
         System.out.println("Enter a hemo");
        float hemo;
        hemo=scan.nextFloat();
            System.out.println("Enter a gender");
            if(age>=12&&age<18){
                 System.out.println("Enter a age");
                 if(hemo>=13&&hemo<16){
                    System.out.println("hemo lev normal");
                 }
                 else{
                    System.out.println("hemo lev abnormal");
                 }
            }
            else if(age>=18){
                System.out.println("Enter a age");
                if(hemo>=13.6&&hemo<17.7){
                    System.out.println("hemo lev normal");
                }
                else{
                    System.out.println("hemo lev abnormal");
            }
            }

        }
                }
            }
            
            

        

    

