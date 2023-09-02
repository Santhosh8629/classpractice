public class arraymovezero{
    public static void main(String args[]){
        int num[]={0,1,0,3,12};
        int len=num.length;
        int a=0;
        int num1[]=new int[len];
        for(int i=0;i<len;i++){
            if(num[i]!=0){
            num1[a]=num[i];
            a++;
            }
        }
          for(int i=0;i<len;i++){
                System.out.println(num1[i]);
            }
        }
    }

