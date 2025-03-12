public class File{
    public int add(int num1,int num2){
        int num=num1+num2;
        return num;

    }
    public int sub(int num1,int num2){
        int num=num1-num2;
        return num;
    }
    public int multi(int num1,int num2){
        int num=num1*num2;
        return num;
    }
    public int div(int num1,int num2){
        int num =num1/num2;
        return num;
    }
    public static void main(String args[]){
        File obj=new File();
       int c= obj.add(50,20);
       int a= obj.sub(10,5);
       int b= obj.multi(10,2);
       int d= obj.div(50,5);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b);


    }
}