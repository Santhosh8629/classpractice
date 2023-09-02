import java.util.Scanner;
public class input{
    public static void main(String[] args){
         Scanner scan=new Scanner(System.in);
         String name1;
         String name2;
         String clg1;
         String clg2;
         long mbl1;
         long mbl2;
         boolean pass1;
         boolean pass2;
         char grade1;
         char grade2;
         float cgpa1;
         float cgpa2;
         System.out.print("Enter name1:");
         name1=scan.nextLine();
         System.out.print("Enter name2:");
         name2=scan.nextLine();
         System.out.print("Enter clg1:");
         clg1=scan.nextLine();
         System.out.print("Enter clg2:");
         clg2=scan.nextLine();
         System.out.print("Enter mbl1:");
         mbl1=scan.nextLong();
         System.out.print("Enter mbl2:");
         mbl2=scan.nextLong();
         System.out.print("Enter bool1:");
         pass1=scan.nextBoolean();
         System.out.print("Enter bool2:");
         pass2=scan.nextBoolean();
         System.out.print("Enter grade1:");
         grade1=scan.next().charAt(0);
         System.out.println(grade1);
         System.out.print("Enter grade2:");
         grade2=scan.next().charAt(1);
         System.out.println(grade2);
         System.out.print("Enter cgpa1:");
         cgpa1=scan.nextFloat();
         System.out.print("Enter cgpa2:");
         cgpa2=scan.nextFloat();


         System.out.println("---------------------------------------------------------------------");
         System.out.println("NAME\t\tCOLLEGE\t\tPHONENO\t\t10thPASS\t\tGRADE\t\tCGPA");
         System.out.println( name1+"\t"+clg1+"\t"+mbl1+"\t\t"+pass1+"\t"+grade1+"\t"+cgpa1);
         System.out.println( name2+"\t"+clg2+"\t"+mbl2+"\t\t"+pass2+"\t"+grade2+"\t"+cgpa2);
         System.out.println("----------------------------------------------------------------------");
    }
}