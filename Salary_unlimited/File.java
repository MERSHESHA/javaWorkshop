import java.util.*;
 public class File{
     public static void main(String args[]){
         Scanner input=new Scanner(System.in);
         System.out.println("enter your profession");
         String name=input.nextLine();
         System.out.println("salary");
         double salary=input.nextInt();
           int i=1;
            double Salarys=0;
            while(true){
         
         if(name.equals("manager")){               
           
             salary=salary+salary*0.2;
           
             System.out.println(salary);
         }
        else if(name.equals("developer")){
            
             salary=salary+salary*0.1;
           
             System.out.println(salary);
         }
         else{
             System.out.println("invalid profession");
         }
         
         
     }
     i=i+1;
 }
 }