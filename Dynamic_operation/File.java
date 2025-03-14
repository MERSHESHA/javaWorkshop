
import java.util.*;
public class File{
    public static void main(String args[]){
         Scanner input=new Scanner(System.in);
        System.out.println("1.Addition\n 2.Subtractor\n 3.Multiplication\n 4.Division");
        System.out.println("enter your choice");
        int choice=input.nextInt();
        System.out.println("enter a number1");
        int num1=input.nextInt();
        System.out.println("enter a number2");
         int num2=input.nextInt();
         int result=0;
         
         if(choice==1){
            result=num1+num2;
            System.out.println("result:"+result);
         }
         else if(choice==2){
             result=num1-num2;
            System.out.println("result:"+result);
         }
         else if(choice==3){
            result=num1*num2;
            System.out.println("result:"+result) ;
         }
         else if(choice==4){
            result=num1/num2;
            System.out.println("result:"+result) ;
         }
         else{
            System.out.println("invalid choice");
         }
         input.close();
    }
}