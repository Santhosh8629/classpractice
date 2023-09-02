class laptop{
    public String brand;
    public int Ram;
    public int megapixel;

public void modelname(String name){
    System.out.println("BRAND   "+name);
}
public void features(int Ram){
    System.out.println("RAM     "+Ram);
}
}
public class oop{
    public static void main(String args[]){
        laptop PC=new laptop();
        PC.modelname("APPLE");
        PC.features(4);
       
         
        
    }
}