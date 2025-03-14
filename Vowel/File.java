import java.util.*;
public class File{
    public static void main(String args[]){
        String arr[]={"a","e","i","o","u"};
        Scanner input=new Scanner(System.in);
        System.out.println("enter the letter");
        String ch=input.nextLine();
        int de=0;
        int i=0;
        while(i<=4){
            if(ch.equals(arr[i])){
                 de=1;
                 }
                 i=i+1;
        }     
        if(de==1){
            System.out.println("Vowel");
        } 
      else{
        System.out.println("not a vowel");
      }
    }
}