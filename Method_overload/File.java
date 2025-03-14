public class File{
    public void sub(int num1,int num2){
            int num=num1-num2;
            System.out.println(num);
        }
        public void sub(int num1,int num2,int num3){

            int num=num1-num2-num3;
            System.out.println(num);
        }
    public static void main(String args[]){
       File obj=new File();
       obj.sub(40,30);
       obj.sub(40,60); 
       
    }
}