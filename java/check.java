public class check{
    public static void main(String[] args){
       //num1+num2==1+2;

        int []num1={8,2,3,4,5,6,7,1};
        int len=num1.length;
        int target=15;
        int res[]=sum(num1,target);
        System.out.println(res[0]+"  "+res[1]);
        int num3[]={2,89,4,5,65,8,9};
        int target1=11;
        int res1[]=sum(num3,target1);
        System.out.println(res1[0]+"  "+res1[1]);
    }
    public static int [] sum(int[] num,int num1){
        int nu[]=new int[2];
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==num1){
                    nu[0]=i;
                    nu[1]=j;

                }
            }
        }
      
        return nu;
    }
}