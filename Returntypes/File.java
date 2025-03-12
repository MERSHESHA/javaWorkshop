public class File{
    public int add(int num1,int num2){
        int num=num1+num2;
        return num;

    }
    public static void main(String args[]){
        File obj=new File();
       int c= obj.add(50,20);
        System.out.println(c);


    }
}