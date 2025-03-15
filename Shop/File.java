import java.util.*;
public class File{
   
        public void calculateTotalPrice(int prices,boolean isPremiumMember){
            double total=0;
            
             if(prices>=5000){
                total=prices*0.90;
                System.out.println(total);
            }
            else if (isPremiumMember){
                total=prices*0.95;
                System.out.println(total);
            }
            else{
                System.out.println("not premium");
            }

        }
        public static void main(String[] args){
            boolean isPremiMember=true;
            Scanner input=new Scanner(System.in);
            while(true){
            System.out.println("Price");
            int prices=input.nextInt();
            File sc=new File();
            sc.calculateTotalPrice( prices,isPremiumMember);

        
        }
    }
}