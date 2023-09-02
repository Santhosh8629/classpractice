import java.util.Scanner;
    public class detail19{
      public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER A GENDER");
        String gender=scan.nextLine();
        //String a;
        gender=gender.toLowerCase();
        if(gender.contains("male")&&!gender.contains("female")){
            
            int mark;
            System.out.println("ENTER MARK");
            mark=scan.nextInt();
            if(mark>=70){
                System.out.println("ELIGIBLE");
            }
            else{
                System.out.println("NOT ELIGIBLE");
            }
        }
        else{
            System.out.print("NOT ELIGIBLE");
        }

        }

      
}