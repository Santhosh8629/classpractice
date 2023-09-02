class dogs{
    public String eat;
    public String colour;
    public int age;

public void food(String foodname){
    System.out.println("BRAND  "+foodname);
}
public void colour(String dogcolour){
    System.out.println("COLOUR OF DOG  "+dogcolour);
}
public void age(int dogage){
    System.out.println("AGE OF DOG  "+dogage);
}
}    
class fruit{
    public String APPLE;
    public String BANANA;
    public String MANGO;

public void creatine(String APPLE){
    System.out.println("CREATINE "+APPLE);
}
public void protien(String BANANA){
    System.out.println("PROTIEN "+BANANA);
}
public void calcium(String MANGO){
    System.out.println("CALCIUM "+MANGO);
}
}
class fan{
    public String USHA;
    public String CROMPTON;
    public String SKY;

public void speed(String USHA){
    System.out.println("FAN SPEED  "+USHA);
}
public void medium(String CROMPTON){
    System.out.println("NORMAL BRAND "+CROMPTON);
}
public void slow(String SKY){
    System.out.println("LOCAL BRAND "+SKY);
}
}
public class oops{
    public static void main(String args[]){
        dogs men=new dogs();
        men.food("PEDIGREE");
        men.colour("BLACKY");
        men.age(5);
        fruit energy=new fruit();
        energy.creatine("NORMAL");
        energy.protien("HIGH");
        energy.calcium("UPNORMAL");
        fan cooling=new fan();
        cooling.speed("HIGH");
        cooling.medium("NORMAL");
        cooling.slow("VERY SLOW");

    }
}



