public class practice3{
    public static void main(String args[]){
        int a=51;
        if(a%2==0){
            System.out.println("EVEN");
            if(a%4==0){
                System.out.println("GIVEN IS MULTIPLE BY 4");
            }
            else{
                System.out.println("ODD NUMBER NOT MULTIPLE BY 4");
            }
        }
        else{
            System.out.println("ODD");
            if(a%3==0){
                System.out.println("GIVEN NUMBER MULTIPLE BY 3");
            }
            else{
                System.out.println("EVEN NUMBER NOT MULTIPLE BY 3");
            }
        }
    }
}