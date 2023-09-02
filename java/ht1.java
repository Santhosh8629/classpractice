import java.util.Scanner;
public class ht1{
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER A GENDER");
        char gender=scan.next().charAt(0);
        if(gender=='C'||gender=='c'){
            System.out.println("CHILD");
            System.out.println("MONTH");
            int month;
            month=scan.nextInt();
            System.out.println("AGE");
            int age;
            age=scan.nextInt();
            System.out.println("HEMO");
            float hemo;
            hemo=scan.nextFloat();
            if(month>=1){
                if(hemo>=10&&hemo<20&&age<=1){
                    System.out.println("HEMO LEVEL NORMAL");
                }
                else{
                    System.out.println("HEMO LEVEL ABNORMAL");
                }
            }
            else if(month>=1&&month<2&&age<1){
                if(hemo>=10&&hemo<18){
                    System.out.println("HEMO LEVEL NORMAL");
                }
                else{
                    System.out.println("HEMO LEVEL ABNORMAL");
                }
            }
            else if(month>=2&&month<6&&age>=1){
                if(hemo>=6&&age<=2){
                    System.out.println("HEMO LEVEL NORMAL");
                }
                else{
                    System.out.println("HEMO LEVEL NORMAL");
                }
            }
            else if(month>=6&&age<=2){
                if(hemo>=10.5&&hemo<13.5){
                    System.out.println("HEMO LEVEL NORMAL");
                }
                else{
                    System.out.println("HEMO LEVEL ABNORMAL");
                }
            }
            else if(age>=2&&age<6){
                if(hemo>=11.5&&hemo<13.5){
                    System.out.println("HEMO LEVEL NORMAL");
                }
                else{
                    System.out.println("HEMO LEVEL ABNORMAL");
                }
            }
            else{
                if(hemo>=11.5&&hemo<15.5){
                    System.out.println("HEMO LEVEL NORMAL");
                }
                else{
                    System.out.println("HEMO LEVEL ABNORMAL");
                }
            }


        }
        else if(gender=='F'||gender=='f'){
            System.out.println("AGE");
            int age;
            age=scan.nextInt();
            System.out.println("HEMO");
            float hemo;
            hemo=scan.nextFloat();
            if(age>=12&&age<18){
                if(hemo>=12&&hemo<16){
                    System.out.println("HEMO LEVEL NORMAL");
                }
                else{
                    System.out.println("HEMO LEVEL ABNORMAL");
                }
            }
            else{
                if(hemo>=12.1&&hemo<15.1){
                    System.out.println("HEMO LEVEL NORMAL");
                }
                else{
                    System.out.println("HEMO LEVEL NORMAL");
                }
            }
        }
        else if(gender=='M'||gender=='m'){
            System.out.println("AGE");
            int age;
            age=scan.nextInt();
            System.out.println("HEMO");
            float hemo;
            hemo=scan.nextFloat();
            if(age>=12&&age<18){
                if(hemo>=13&&hemo<16){
                    System.out.println("HEMO LEVEL NORMAL");
                }
                else{
                    System.out.println("HEMO LEVEL ABNORMAL");
                }
            }
            else{
                if(hemo>=13.6&&hemo<17.7){
                    System.out.println("HEMO LEVEL NORMAL");
                }
                else{
                    System.out.println("HEMO LEVEL NORMAL");
                }
            }
        }
        
        

        
    }
}