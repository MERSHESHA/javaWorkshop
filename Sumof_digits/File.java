import java.util.*;
public class File{
        public static void main(String args[]){
          Scanner input=new Scanner(System.in);
          System.out.println("Enter the n values");
          int n=input.nextInt();
          int a[]=new int[n];
          int i=0;
          while(i<n){
            System.out.println("Enter the value");
            a[i]=input.nextInt();
            i=i+1;

          } 
          i=0;
          int count=0;
          while(i<n){
            
            count=count+a[i];
            i=i+1;
          }
          System.out.println("sum"+count);
        }
}