import java.util.*;
public class File{
        public static void main(String args[]){
          Scanner input=new Scanner(System.in);
          System.out.println("Enter the number");
          int num=input.nextInt();
         boolean prime=true;
         if(num<=1){
                System.out.println("It is not a prime");

         }
         for(int i=2;i<num;i++){
                if(num%i==0){
                 prime=false;
                }
         }
        
         
         if(prime)
         
         {
            
            System.out.println("prime");
         }
         else{
                System.out.println("not a prime");
         }
        
        }
}