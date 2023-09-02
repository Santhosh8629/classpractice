public class main{
    public static void main(String args[]){
    
    Car maruthi=new Car();
    maruthi.colour="Red";
    maruthi.make="India";
    Car toyoto=new Car();
    toyoto.colour="BLUE";
    toyoto.make="CHINA";
    Car audi=new Car();
    audi.colour="WHITE";
    audi.make="US";
    Car hyndai=new Car();
    hyndai.colour="BLACK";
    hyndai.make="JABAN";


    System.out.println(maruthi.colour);
    System.out.println(maruthi.make);
    System.out.println(toyoto.colour);
    System.out.println(toyoto.make);
    System.out.println(audi.colour);
    System.out.println(audi.make);


    }
}
class Car{
    public String colour;
    public String make;
  
    

    // System.out.print(colour);
    // System.out.print(make);


}
