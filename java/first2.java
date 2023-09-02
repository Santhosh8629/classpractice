import java.util.Scanner;
public  class first2{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println(" NAME   MBL NO     EMAIL");
    String name;
    long mbl;
    String email;
    name=scan.nextLine();
    mbl=scan.nextLong();
    email=scan.nextLine();
    System.out.print( name+"  "+mbl+"   "+email);
    String name1;
    long mbl1;
    String email1;
    name1=scan.nextLine();
    mbl1=scan.nextLong();
    email1=scan.nextLine();
    System.out.print( name1+"  "+mbl1+"  "+email1);
     
    }
}