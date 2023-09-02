public class first6{
    public static void main(String args[]){
        int a=100;
        int b=200;
        int c=300;
        if(a>b&&a>c){
            System.out.println(" A IS GREATER");
            if(b>c){
                System.out.println("B IS SECOND GREATER\n C IS SMALLER");
            }
            else{
                System.out.println("B IS SMALLER\n C IS GREATER ");
            }
        }
        else if(b>a&&b>c){
            System.out.println(" B IS GREATER");
            if(a>c){
                System.out.println(" A IS SECOND GREATER\n C IS SMALLER");
            }
            else{
                System.out.println(" C IS SMALLER\n A IS GREATER");
            }
        }
        else{
            System.out.println(" C IS GREATER");
            if(b>a){
                System.out.println("B IS SECOND GREATER\n A IS SMALLER");
            }
            else{
                System.out.println("A IS GREATER\n B IS SMALLER");
            }
        }
    }
}