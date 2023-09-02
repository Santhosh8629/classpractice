import java.util.Scanner;
public class arrayname{
    public static void main(String args[]){
    Scanner scan=new Scanner (System.in);
    String name[]={"santhsosh","saravana","sanjai","vishnu","kannan",};
    int len=name.length;
    System.out.println(name[0]);
    for(int i=0;i<=len-1;i++){
    System.out.println(name[i]);
}
    }
}