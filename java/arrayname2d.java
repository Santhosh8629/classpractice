public class arrayname2d{
    public static void main(String args[]){
        String name[][]={{"santhosh"},{"sanjai"},{"saravana"}};
        int len=name.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.println(name[i][j]);
            }
        }

    }
}