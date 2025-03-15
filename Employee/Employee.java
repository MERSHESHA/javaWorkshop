import java.util.*;
class Employee1
{
    int calculateSalary()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the salary:");
        int basesalary=sc.nextInt();
        return basesalary;
        
    }
}
    class Manager extends Employee1
    {
        void view()
        {
            int basesalary=calculateSalary();
            double percent=basesalary*0.2;
            double salary1=basesalary+percent;
            System.out.println("The salary is:"+salary1);
        }
        
    }
    class Developer extends Employee1
    {
        void display()
        {
            int basesalary=calculateSalary();
            double percent2=basesalary*0.1;
            double salary2=basesalary+percent2;
            System.out.println("The salary is:"+salary2);
        }
        
    }
    public class Employee
    {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("\n1.Developer\n2.Manager");
        System.out.println("Enter the choice:");
        int i=sc.nextInt();
        if(i==1)
        {
        Manager a=new Manager();
        a.view();
        }
        else if(i==2)
        {
        Developer b=new Developer();
        b.display();
        }
        i=i+1;
        }
    }
    }