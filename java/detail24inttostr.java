import java.util.*;
public class detail24inttostr{
    public static void main(String args[]){
        int num[]={12,2,34,4,5};
        String str=Arrays.toString(num);
        str=str.replace(",","");
        str=str.replace(" ","");
        str=str.replace("[","");
        str=str.replace("]","");
        //  str=str.replace("12","");
        //  str=str.replace("2","");
        //  str=str.replace("34","");
        //  str=str.replace("4","");
        //  str=str.replace("5",""); 
        
         //System.out.print(str);
         Double val=Double.parseDouble(str);
         System.out.print(val);
         
        

    }
}