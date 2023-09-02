import java.util.*;
public class collectionlistmethod{
    public static void main(String args[]){
        ArrayList<String> str=new ArrayList<String>();
        str.add("TAMIL");
        str.add("ENGLISH");
        str.add("MATHS");
        str.add("SCIENCE");
        for(String a:str){
            System.out.println(a);
        }
        System.out.println(str.clone());
        System.out.println(str.size());
        
    }
}