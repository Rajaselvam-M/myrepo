import java.util.*;
public class maxvaluinexception 
{public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int availableBalance=1000;
        int balance=sc.nextInt();
        try
        {
            if(balance>availableBalance)
                throw new ArithmeticException();
            System.out.println(" avaliable balance");
        }
        catch(ArithmeticException e)
        {
            System.out.println(" not available balance");
        }
    }
    
}

    

